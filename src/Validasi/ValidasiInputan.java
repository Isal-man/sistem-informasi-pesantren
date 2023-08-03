package Validasi;

public class ValidasiInputan implements Validasii {

    @Override
    public int cekNama(String nama) {
        int huruf = 0;
        int huruf2 = 0;
        String spasi = " ";

        if (nama.startsWith(spasi) || nama.endsWith(spasi) || nama.charAt(0) == '\'' || nama.charAt(nama.length() - 1) == '\'' || nama.charAt(0) == '-' || nama.charAt(nama.length() - 1) == '-') {
            huruf2 = 1;
            return huruf2;
        }
        for (int x = 0; x < nama.length(); x++) {
            if (!(nama.charAt(x) >= 'a' && nama.charAt(x) <= 'z' || nama.charAt(x) >= 'A' && nama.charAt(x) <= 'Z' || nama.charAt(x) == '\'' && nama.charAt(x + 1) != '\'' && nama.charAt(x + 1) != ' ' && nama.charAt(x + 1) != '-' || nama.charAt(x) == ' ' && nama.charAt(x + 1) != ' ' && nama.charAt(x + 1) != '-' || nama.charAt(x) == '-' && nama.charAt(x + 1) != '-' && nama.charAt(x + 1) != ' ' && nama.charAt(x + 1) != '\'')) {
                huruf++;
            }
        }

        return huruf;
    }

    @Override
    public int cekHuruf(String abjad) {
        int huruf = 0;
        int huruf2 = 0;
        if (abjad.charAt(0) == ' ' || abjad.charAt(abjad.length() - 1) == ' ' || abjad.charAt(0) == '\'' || abjad.charAt(abjad.length() - 1) == '\'' || abjad.charAt(0) == '-' || abjad.charAt(abjad.length() - 1) == '-') {
            huruf2 = 1;
            return huruf2;
        }
        for (int x = 0; x < abjad.length(); x++) {
            if (!(abjad.charAt(x) >= 'a' && abjad.charAt(x) <= 'z' || abjad.charAt(x) >= 'A' && abjad.charAt(x) <= 'Z' || abjad.charAt(x) == '\'' && abjad.charAt(x + 1) != '\'' && abjad.charAt(x + 1) != ' ' && abjad.charAt(x + 1) != '-' || abjad.charAt(x) == ' ' && abjad.charAt(x + 1) != ' ' && abjad.charAt(x + 1) != '-' || abjad.charAt(x) == '-' && abjad.charAt(x + 1) != '-' && abjad.charAt(x + 1) != ' ' && abjad.charAt(x + 1) != '\'')) {
                huruf++;
            }
        }
        return huruf;
    }

    @Override
    public int cekUsername(String username) {
        int name = 0;
        int huruf2 = 0;

        if (username.contains(" ")) {
            huruf2 = 1;
            return huruf2;
        }
        for (int x = 0; x < username.length(); x++) {
            if (!(username.charAt(x) >= 'a' && username.charAt(x) <= 'z' || username.charAt(x) >= 'A' && username.charAt(x) <= 'Z' || username.charAt(x) == '.' && username.charAt(x + 1) != '.' || username.charAt(x) >= '0' && username.charAt(x) <= '9' || username.charAt(x) != ' ' && username.charAt(x) == ' ' || username.charAt(x) == '_' && username.charAt(x + 1) != '_')) {
                name++;
            }
        }
        return name;
    }

    @Override
    public int cekPassword(String password) {
        int pss = 0;
        int valpss2 = 0;

        if (password.contains(" ")) {
            valpss2 = 1;
            return valpss2;
        }
        for (int x = 0; x < password.length(); x++) {
            if (!(password.charAt(x) >= 'a' && password.charAt(x) <= 'z' || password.charAt(x) >= 'A' && password.charAt(x) <= 'Z' || password.charAt(x) >= '0' && password.charAt(x) <= '9' || password.charAt(x) == ' ')) {
                pss++;
            }
        }
        return pss;
    }

    @Override
    public int cekAlamat(String alamat) {
        int val = 0;
        int huruf2 = 0;
        if (alamat.charAt(0) == ' ' || alamat.charAt(0) == '.' || alamat.charAt(0) == ',' || alamat.charAt(0) == '-' || alamat.charAt(alamat.length() - 1) == ' ' || alamat.charAt(0) == '\'' || alamat.charAt(alamat.length() - 1) == '\'') {
            huruf2 = 1;
            return huruf2;
        }
        for (int i = 0; i < alamat.length(); i++) {
            if (!(alamat.charAt(i) >= 'a' && alamat.charAt(i) <= 'z' || alamat.charAt(i) >= 'A' && alamat.charAt(i) <= 'Z' || alamat.charAt(i) == '.' && alamat.charAt(i + 1) != '.' || alamat.charAt(i) >= '0' && alamat.charAt(i) <= '9' || alamat.charAt(i) == '-' && alamat.charAt(i + 1) != '-' || alamat.charAt(i) == ',' && alamat.charAt(i + 1) != ',' || alamat.charAt(i) == ' ' && alamat.charAt(i + 1) != ' ')) {
                val++;
            }
        }
        return val;
    }

    @Override
    public int cekNIS(String nis) {
        int huruf = 0;
        int huruf2 = 0;
        if (nis.contains(" ")) {
            huruf2 = 1;
            return huruf2;
        }
        for (int x = 0; x < nis.length(); x++) {
            if (!(nis.charAt(x) >= '0' && nis.charAt(x) <= '9')) {
                huruf++;
            }
        }
        return huruf;
    }

    @Override
    public int cekNoHp(String noHp) {
        int huruf = 0;
        int huruf2 = 0;
        if (noHp.contains(" ") || noHp.charAt(2) == '6' || noHp.charAt(2) == '4' || noHp.charAt(2) == '0') {
            huruf2 = 1;
            return huruf2;
        }
        for (int x = 0; x < noHp.length(); x++) {
            if (!(noHp.charAt(x) >= '0' && noHp.charAt(x) <= '9' || noHp.charAt(0) != '+' || noHp.charAt(0) != '6' || noHp.charAt(0) != '2' || noHp.charAt(0) != '8')) {
                huruf++;
            }
        }

        return huruf;
    }

}
