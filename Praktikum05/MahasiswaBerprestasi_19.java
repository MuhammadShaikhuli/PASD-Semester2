public class MahasiswaBerprestasi_19 {
    Mahasiswa_19 [] listMhs = new Mahasiswa_19[5];
    int idx;

    void tambah (Mahasiswa_19 m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (Mahasiswa_19 m:listMhs){
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa_19 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
