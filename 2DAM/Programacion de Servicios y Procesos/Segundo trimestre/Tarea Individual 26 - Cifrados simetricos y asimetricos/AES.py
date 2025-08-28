from Crypto.Cipher import AES
from cryptography.hazmat.primitives.asymmetric import rsa
from cryptography.hazmat.primitives import serialization

#PRIMERO ----------------------------------------------------------------

#Definir una clave de 16 bytes (128 bits)
key = b'Sixteen byte key'

#Crear el objeto de cifrado AES en modo EAX
cipher = AES.new(key, AES.MODE_EAX)

#Mensaje a cifrar
plaintext = b'hello'

#Cifrar y obtener el ciphertext y el tag de autenticación
ciphertext, tag = cipher.encrypt_and_digest(plaintext)

print("Texto cifrado con AES: ", ciphertext.hex())


#SEGUNDO ----------------------------------------------------------------

#Generar un par de claves RSA (clave privada y publica)

private_key = rsa.generate_private_key(
    public_exponent = 65537,
    key_size = 2048
)

#Obtener la clave publica
public_key = private_key.public_key()

#Serializar las claves en formato PEM para guardarlas
private_pem = private_key.private_bytes(
    encoding=serialization.Encoding.PEM,
    format=serialization.PrivateFormat.TraditionalOpenSSL,
    encryption_algorithm=serialization.NoEncryption()
)

public_pem = public_key.public_bytes(
    encoding=serialization.Encoding.PEM,
    format=serialization.PublicFormat.SubjectPublicKeyInfo

)


print("Clave privada RSA: ")
print(private_pem.decode())

print("Clave publica RSA: ")
print(public_pem.decode())
