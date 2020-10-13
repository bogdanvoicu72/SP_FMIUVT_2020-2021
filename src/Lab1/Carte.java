package Lab1;

public class Carte {
    private String autor;
    private String titlu;
    private int nrPag;
    private int an_aparitie;

    public Carte(String autor, String titlu, int nrPag, int an_aparitie) {
        this.autor = autor;
        this.titlu = titlu;
        this.nrPag = nrPag;
        this.an_aparitie = an_aparitie;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    public void setAn_aparitie(int an_aparitie) {
        this.an_aparitie = an_aparitie;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getNrPag() {
        return nrPag;
    }

    public int getAn_aparitie() {
        return an_aparitie;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "autor='" + autor + '\'' +
                ", titlu='" + titlu + '\'' +
                ", nrPag=" + nrPag +
                ", an_aparitie=" + an_aparitie +
                '}';
    }
}
