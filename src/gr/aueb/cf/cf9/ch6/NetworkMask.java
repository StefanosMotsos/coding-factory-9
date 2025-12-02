package gr.aueb.cf.cf9.ch6;

public class NetworkMask {
    public static void main(String[] args) {
        int[] ip = {192, 168, 2, 10};
        int[] subnetMask = {255, 255, 255, 0};
        int[] networkAddress = new int[4];

        for (int i = 0; i < 4; i++) {
            networkAddress[i] = ip[i] & subnetMask[i];
        }

        System.out.printf("%d.%d.%d.%d", networkAddress[0], networkAddress[1], networkAddress[2], networkAddress[3]);
    }
}
