[Descárgatelo aquí, formato Word](https://docs.google.com/document/d/1uCgmoepLmgppHb6drm3dt01M9XlaVzDoiOHXyYwVKdg/edit?usp=sharing)


# PREGUNTAS EXÁMEN:
- conf red
- GW/Gateway
- Mask/máscara
- IP , pública o privada, y cómo asignarla
- NAT
- DHCP
- DNS
- TCP
- HTTP
- Socket.
- Red de paquetes-ip (redundancia)

- RDP
- VNC
- UDP


## Máscara de red:
 Para hacer una comunicación entre dos máquinas. hay que averiguar la dirección de ip. con la máscara se puede averiguar si va a estar en la red o no.
Sirve para ver si el dispositivo al que se manda el paquete está en la misma red local.
Si no, se manda a la puerta de enlace.

## Gateway/puerta de enlace:
Sirve para dirigir la información a internet.
Si no coincide la primera parte de la ip, se le manda directamente al gateway para que el busque con quien se tiene que comunicar, con la ayuda de la máscara.

## IP:
Internet Protocol / Protocolo de Internet.
Es un número/identificador de un dispositivo que se conecta a internet. Sirve para el intercambio de paquetes de información con otros equipos que también usan el protocolo de internet.
Con la IP, un equipo puede recibir la información de otros equipos, siempre que éstos sepan su IP.
Un equipo puede tener una IP pública y otra privada, pero todos los equipos conectados a un wifi tienen la misma IP pública. Es el router, actuando como puerta de enlace, el que ve la dirección privada y termina de enviar la información.
Los sitios web no ven directamente tu IP privada, si no la pública.

## DHCP:
Protocolo de Configuración Dinámica de Host.
Es un servidor encargado de asignar IP’s (y otros parámetros de red) a los dispositivos. Guarda un registro de las que tiene asignadas, por lo que evita asignarle la misma IP a dos dispositivos diferentes, y facilita la conexión de dispositivos nuevos.
Sin él, el administrador de la red tendría que configurar todo ésto de manera manual.

## NAT:
Network Address Translation / Traducción de Direcciones de Red.
Es un proceso que permite asignarle la misma IP pública a varios dispositivos, aunque cada uno de ellos tenga una IP privada diferente.
Se realiza en el router(o el dispositivo que se use para conectarse a internet).
Es necesario para ahorrar direcciones de IP’s públicas; Cuando se creó internet, sólo se resevaron 32 bits de direcciones diferentes. Al poder poner varias IP’s privadas como una sola IP pública, se acabarán más tarde.

## DNS:
Domain Name System / Sistema de Nombres de DOMINIO.
Traduce los nombres de dominio de internet(p.ej: www.google.com) a IP’s, para que los navegadores puedan enviar y recibir información de otros dispositivos.
Sin ellos, en vez de buscar ‘google.com’, tendríamos que buscar la su IP, es decir, tendríamos que saber el conjunto de números que identifica a cada navegador paraa poder acceder a él.

## TCP:
Transmision Control Protocol / Protocolo de Control de Transmisión.
Es un estándar o conjunto de reglas comunes para todos, que define la manera en la que se establece y mantiene un intercambio de datos por la red.
Descompone los paquetes de información y los manda a la IP destinataria, para agilizar el proceso y evitar problemas.
Además, éstas partes del paquete pueden ir por rutas diferentes en caso de que la ruta principal esté congestionada.
Garantiza que llega en el mismo orden que lo mandas

## UDP:
User Datagram Protocol o Protocolo de Datagramas de Usuario.
Es un protocolo de comunicación que se utiliza en redes basadas en IP. A diferencia del TCP, funciona sin conexión, lo que significa que no requiere establecer una conexión previa entre el emisor y el receptor antes de enviar datos.


## HTTP:
HyperText Transfer Protocol/Protocolo de Transferencia de Hiper Textos.
Es la base de las webs, y establece de qué manera(orden, posición…) se transfiere la información. Tiene una estructura Cliente/Servidor; es un esquema de petición en el que el cliente le pide al servidor(p.ej: una web) la información que necesita.
No tiene estado, por lo que no guarda ninguna información del cliente por sí solo. Para eso se podrían utilizar las cookies.


# Info general redes:
Suele haber 2 redes. Se pueden crear más redes, pero no hablaran con nadie a no ser que se conectará otra máquina a la misma red.
Las máquinas virtuales, los pc's y los portátiles cuentan como hosts.
la máquina virtual tiene un NAT que se la info pasa por el mismo cable, pero no deja que las demás máquinas lo vean.

Los puertos 1-1024 están reservados al sistema.
Decidieron no usar el 80 para no contaminarlo.
El puerto 22 es el estándar.
El puerto 8080 lo puede leer todo el mundo, 
El 631 es el de las impresoras.

El objetivo del socket es establecer un tubo bidireccional con un servidor remoto.. si hubiera más clientes, podría haber más tubos.

## Diferencias software libre y software gratis:
El software libre te da la libertad de hacer con él lo que quieras, puedes modificarlo, vender copias modificadas/mejoradas… Pero te pueden cobrar por él.
Simplemente el software gratis no se cobra, pero tampoco quiere decir que se pueda hacer con él lo que quieras, como sí se puede hacer con el software libre.
Conclusión: Un software puede ser gratuito pero que no puedas revenderlo ni modificarlo, o te pueden cobrar por un software que puedas modificar y revender. O puede ser que sea libre y gratis a la vez, es decir, que puedas hacer con él lo que quieras, y , aún así, no te lo cobren.


-----------------------------------------------------------------------------------------------------------------

Cae en el examen: 


1. Windows
2. Sistema de ficheros
3. Parte administrativa
	- Crear usuarios
	- Eventos
	- Servicios
	- Discos
4. Servicios en red
5. Windows Server

-----------------------------------------------------------------------------------------------------------------

## Administrador de eventos:
Consulta la BBDD  de eventos y carga en una tabla un resumen de lo que ha pasado en los últimos días.
Registra los errores por niveles


Puntero nulo:
Apunta a una dirección y que se pierde algo de información, o no apunta a nada. Esto es importante.
Java hace implícitamente la designación de los punteros,
C los hace explícitos.

Tienen directorios de memoria, y no puede haber punteros que apunten fuera. el hardware es capaz de comprobarlo.

Los móviles android son una máquina virtual de java.
Hay que usar un certificado cliente.
Hay certificados web.





[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fjotaaloud%2FDesarrollo_aplicaciones_multiplataforma%2Ftree%2Fmain%2F1DAM%2FSistemas%2F3erTrim&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=Visitor+counter&edge_flat=false)](https://hits.seeyoufarm.com)
