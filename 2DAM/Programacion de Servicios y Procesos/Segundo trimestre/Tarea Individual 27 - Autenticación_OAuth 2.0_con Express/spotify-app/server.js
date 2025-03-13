require('dotenv').config();
console.log(process.env.SPOTIFY_CLIENT_ID);  // Debería mostrar tu CLIENT_ID
console.log(process.env.SPOTIFY_CLIENT_SECRET);  // Debería mostrar tu CLIENT_SECRET
console.log(process.env.SPOTIFY_REDIRECT_URI);  // Debería mostrar la URL de redirección
const express = require('express');
const cors = require('cors');
const axios = require('axios');
const querystring = require('querystring');

const app = express();
const PORT = 3000;

// Habilitar CORS para permitir peticiones desde otros dominios
app.use(cors());

// Ruta para iniciar el flujo de autenticación
app.get('/login', (req, res) => {
    const authUrl = 'https://accounts.spotify.com/authorize?' +
        querystring.stringify({
            client_id: process.env.SPOTIFY_CLIENT_ID,
            response_type: 'code',
            redirect_uri: process.env.SPOTIFY_REDIRECT_URI,
            scope: 'user-read-private user-read-email',
        });
    res.redirect(authUrl);
});

// Ruta de callback para manejar la respuesta del servidor de autorización
app.get('/callback', async (req, res) => {
    const code = req.query.code || null;

    try {
        const tokenResponse = await axios.post('https://accounts.spotify.com/api/token',
            querystring.stringify({
                code: code,
                redirect_uri: process.env.SPOTIFY_REDIRECT_URI,
                grant_type: 'authorization_code',
            }),
            {
                headers: {
                    'Authorization': 'Basic ' + Buffer.from(
                        process.env.SPOTIFY_CLIENT_ID + ':' + process.env.SPOTIFY_CLIENT_SECRET
                    ).toString('base64'),
                    'Content-Type': 'application/x-www-form-urlencoded',
                },
            }
        );

        const { access_token, refresh_token } = tokenResponse.data;

        res.json({ access_token, refresh_token });
    } catch (error) {
        res.status(500).json({ error: 'Error obteniendo el token' });
    }
});

// Ruta para obtener datos del perfil del usuario
app.get('/me', async (req, res) => {
    const accessToken = req.headers['authorization'] || req.headers['Authorization'];

    if (!accessToken) {
        return res.status(401).json({ error: 'Falta el token de acceso' });
    }

    console.log('Token recibido:', accessToken);  // Verificar si el token está llegando

    try {
        const userResponse = await axios.get('https://api.spotify.com/v1/me', {
            headers: { Authorization: accessToken },
        });

        res.json(userResponse.data);
    } catch (error) {
        console.error(error);  // Ver detalles del error
        res.status(400).json({ error: 'Error al obtener datos del usuario' });
    }
});



// Iniciar el servidor
app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});




