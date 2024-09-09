## 16. Cliente-Servidor con sockets

Crear dos programas para probar la conexión entre un Cliente y un Servidor uttilizando sockets.

El programa Servidor se llamará Server.java creará un socket en el puerto 5555 y aceptará líneas de texto que escribirá por el terminal (como verificación). Cuando reciba una línea con el texto "Final", cerrará el socket abierto con el cliente.

El programa Cliente se llamará Client.java se conectará al socket creado por el programa Servidor. Si se conecta con el servidor, todas las líneas que se escriban en el terminal se enviarán al Servidor utilizando el socket. Cuando se escriba una línea con el texto "Final", terminará la ejecución.

La entrega será un fichero de nombre Practica16.pdf (formato pdf) con volcados de pantalla que muestren que los dos programas funcionan tal como se pide.

También se entregarán los ficheros Server.java y Client.java