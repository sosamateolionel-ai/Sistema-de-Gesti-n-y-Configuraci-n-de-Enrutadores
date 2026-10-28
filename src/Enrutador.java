public class Enrutador {

    private String identificador;
    private String direccionIP;
    private boolean conectado;

    public Enrutador(String identificador, String ipInicial) {
        this.identificador = identificador;
        this.conectado = false;

        if (esIpValida(ipInicial)) {
            this.direccionIP = ipInicial;
        } else {
            this.direccionIP = "0.0.0.0";
            System.out.println("IP inicial inválida (" + ipInicial + "), se usa 0.0.0.0.");
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isConectado() {
        return conectado;
    }

    public boolean setDireccionIP(String nuevaIp) {

        if (!esIpValida(nuevaIp)) {
            System.out.println("IP rechazada: \"" + nuevaIp + "\" no tiene un formato válido.");
            return false;
        }

        direccionIP = nuevaIp;
        System.out.println("IP actualizada a " + direccionIP + ".");
        return true;
    }

    public void conectar() {
        conectado = true;
        System.out.println(identificador + ": conectado.");
    }

    public void desconectar() {
        conectado = false;
        System.out.println(identificador + ": desconectado.");
    }

    private boolean esIpValida(String ip) {

        if (ip == null) {
            return false;
        }

        String[] partes = ip.split("\\.");

        if (partes.length != 4) {
            return false;
        }

        for (String parte : partes) {
            if (!parte.matches("\\d{1,3}")) {
                return false;
            }
            if (Integer.parseInt(parte) > 255) {
                return false;
            }
        }

        return true;
    }
}