###
endpoints

para ver todas: http://ec2-54-174-157-125.compute-1.amazonaws.com:8080/consultar

para crear una contraseña con json POST : http://ec2-54-174-157-125.compute-1.amazonaws.com:8080/crear

json boy: {
        "password": "contrasenia",
        "text": "texto"

}

## A futuro...

### Se desea a futuro crear una contraseña encriptada.

# Que hice para mi micro servicio:

- Cree la estructura de carpetas que se solicito. 
- Use rutas y casos de uso.
- Para dockerizarla
- hice el mvn clean package y el build.
- luego el docker build -t nombre .
- luego probe correrla y funciono.
- despues para subirla a aws:
- Subi la imagen creada a dockerhub
- descargue la imagen en el contenedor de aws.
- desplegue la imagen en el puerto 80 
y listo.

Cualquier duda no dude en consultarme


