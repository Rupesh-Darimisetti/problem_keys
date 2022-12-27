package org.rupesh.easy;

public class _01_DeFangingAn_IP_Address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String defrag = deFangIPAddress(address);
        System.out.println(defrag);
    }

    public static String deFangIPAddress(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ('.')) {
                str.append("[.]");
            } else {
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
}