public class OperasiNilai19 {
    double[] cariMinMaxUTS(Mahasiswa19[] mhs, int l, int r) {
        if (l == r) {
            return new double[]{mhs[l].nilaiUts, mhs[l].nilaiUts};
        }
        
        int mid = (l + r) / 2;
        double[] left = cariMinMaxUTS(mhs, l, mid);
        double[] right = cariMinMaxUTS(mhs, mid + 1, r);

        double min = (left[0] < right[0]) ? left[0] : right[0];
        double max = (left[1] > right[1]) ? left[1] : right[1];
        
        return new double[]{min, max};
    }

    double hitungRataUasBF(Mahasiswa19[] mhs) {
        double total = 0;
        for (Mahasiswa19 m : mhs) {
            total += m.nilaiUas;
        }
        return total / mhs.length;
    }
}