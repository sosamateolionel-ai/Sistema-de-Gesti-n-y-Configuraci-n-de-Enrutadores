//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Enrutador router = new Enrutador("Router-Oficina", "192.168.0.1");

    System.out.println("IP inicial: " + router.getDireccionIP());

    System.out.println("\n--- IPs válidas ---");
    router.setDireccionIP("10.0.0.1");
    router.setDireccionIP("172.16.254.3");

    System.out.println("\n--- IPs inválidas ---");
    router.setDireccionIP("192.168.1");        // faltan partes
    router.setDireccionIP("256.1.1.1");        // fuera de rango
    router.setDireccionIP("192.168.a.1");      // letras
    router.setDireccionIP("hola");             // sin formato
    router.setDireccionIP(null);               // nula

    System.out.println("\n--- Estado ---");
    router.conectar();
    System.out.println("IP actual: " + router.getDireccionIP());
    System.out.println("Conectado: " + router.isConectado());

}
