Esta es una API CRUD (Create, read, update, delete) para la gestión de productos de una tienda. Implementa control de acceso basado en roles -(RBAC: Role-based Access Control)- mediante Spring Security. Es decir, le concede diferentes permisos a diferentes tipos de usuarios.

Define 2 tipos de usuarios
-
- Admin: puede crear productos, ver sus nombres y el detalle de cada uno, eliminar y modificar productos.
- Cliente: solo puede ver los nombres de los productos.

### Utiliza

- Java
- Spring Boot
- Maven
- Spring Security

## Consigna
Crear una API que gestione el ciclo de vida de los productos de una tienda.

Los productos tienen: nombre:string, precio:double, stock:integer.

La API permite a todos los usuarios registrados:
- listar todos los productos                                GET /api/productos
- listar un producto por ID                                    GET /api/productos/id/{id_producto}
- listar productos que contengan un string en el nombre        GET /api/productos/nombre/{nombre}

Además, los administradores pueden:
- modificar un producto existente                            POST /api/productos/guardar
- crear nuevos productos                                    PUT /api/productos/guardar
- eliminar un producto por ID                                 DELETE /api/productos/eliminar/{id_producto}

Utilizar autenticación básica en la API.