# linio
Automation Linio

Se creo un proyecto en Java de tipo Gradle con patron de diseño Screenplay
Se creo dos runner uno para cada solucion:
Para la primer solucion se creo la automatizacion que busca cualquier producto, y luego verifica que en el carrito de compras este en la descripcion del producto contenga el mismo patron de busqueda.
Para la segunda Solucion la automatizacion consume un servicio rest, el response se podra visualizar en el resporte de Serenity, adicional evalua que el codigo del response sea 200.

Para ejecutar de forma local el proyecto utilizar el siguiente comando en linea de comandos:
gradle clean test aggregate 