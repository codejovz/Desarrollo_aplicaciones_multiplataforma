# Objetivo: 
Crear una aplicación con un menú que permita al usuario reproducir un archivo de audio y un archivo 
de video utilizando ```MediaPlayer``` y ```VideoView``` respectivamente.

---

He separado las actividades en dos. 
Al iniciar la del video, carga el Uri, y mediante un TextView informa de que está parado: 

| ![](assets/image7.png) | ![](assets/image4.png) |
|--|--|


Al iniciarlo, se inicia el vídeo y se cambia el TextView. Se puede volver a pausar: 

| ![](assets/image5.png) | ![](assets/image3.png) |
|--|--|


Y para el audio:

| ![](assets/image1.png) | ![](assets/image2.png) |
|--|--|


## Adicional:
 - Uso de ```AudioManager``` para subir, bajar y mutear el volumen:

| ![](assets/image6.png) | ![](assets/image8.png) |
|--|--|