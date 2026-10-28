# Sistema de Gestión y Configuración de Enrutadores

## Descripción

Este proyecto implementa una clase `Enrutador` que permite administrar la dirección IP y el estado de conexión de un dispositivo de red. Utiliza encapsulamiento y validación de datos para garantizar que las direcciones IP ingresadas tengan un formato válido antes de aceptarlas.

## Funcionamiento

El programa realiza las siguientes operaciones:

1. Crea un enrutador identificado como `Router-Oficina`, con la dirección IP inicial `192.168.0.1`.
2. Muestra la dirección IP inicial.
3. Actualiza la IP con dos direcciones válidas: `10.0.0.1` y `172.16.254.3`.
4. Intenta establecer cinco direcciones inválidas, que son rechazadas sin modificar la última IP válida.
5. Conecta el enrutador y muestra su dirección IP actual y su estado de conexión.

## Clases principales

### Clase `Enrutador`

Representa un dispositivo de red y permite gestionar su configuración.

**Atributos:**

* `identificador`: nombre que identifica al enrutador.
* `direccionIP`: dirección IP actual del dispositivo.
* `conectado`: indica si el enrutador está conectado.

**Métodos principales:**

* `Enrutador(String identificador, String ipInicial)`: inicializa el dispositivo y valida la dirección IP inicial. Si es inválida, utiliza `0.0.0.0`.
* `getIdentificador()`: devuelve el identificador.
* `getDireccionIP()`: devuelve la dirección IP actual.
* `isConectado()`: devuelve el estado de conexión.
* `setDireccionIP(String nuevaIp)`: valida la nueva dirección IP y la actualiza únicamente si es válida. Devuelve `true` o `false` según el resultado.
* `conectar()`: establece el estado de conexión en `true`.
* `desconectar()`: establece el estado de conexión en `false`.
* `esIpValida(String ip)`: método privado que comprueba que la dirección tenga cuatro partes numéricas separadas por puntos y que cada parte esté entre 0 y 255.

### Clase `Main`

Contiene el método `main()` y permite probar la creación del enrutador, la modificación de su dirección IP, el rechazo de entradas inválidas y la gestión del estado de conexión.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos se declaran `private` para impedir el acceso directo desde otras clases.
* **Constructores:** inicializan el identificador, la dirección IP y el estado de conexión.
* **Métodos de acceso (getters):** permiten consultar los datos del objeto.
* **Validación de datos:** verifica el formato y el rango de cada parte de la dirección IP.
* **Métodos privados:** `esIpValida()` oculta los detalles internos de la validación.
* **Condicionales y ciclos:** se utilizan para comprobar cada parte de la dirección IP.
* **Manejo de valores nulos:** se rechazan las direcciones IP con valor `null`.
* **Retorno booleano:** indica si una actualización de IP fue aceptada.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).

## Ejecución

<img width="575" height="537" alt="image" src="https://github.com/user-attachments/assets/ab82f1f0-cab7-4f69-9f8a-8f6564069455" />

## Resultado esperado

El programa debe aceptar las direcciones IP válidas y rechazar las inválidas. La última IP aceptada debe mantenerse después de los intentos fallidos.

Al finalizar, el enrutador tendrá la siguiente configuración:

* **Identificador:** `Router-Oficina`
* **Dirección IP:** `172.16.254.3`
* **Estado de conexión:** `true`

La consola mostrará mensajes de actualización para las IP válidas, mensajes de rechazo para las inválidas y el estado final del dispositivo.

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento y validación de datos en una clase que administra la configuración de un dispositivo de red, evitando modificaciones directas y manteniendo una dirección IP válida ante entradas incorrectas.

## Estructura del proyecto

```text
GestionEnrutadores/
├── src/
│   ├── Enrutador.java
│   └── Main.java
└── README.md
```
