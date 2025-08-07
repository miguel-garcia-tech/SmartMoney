public class Meta {
    private double valorMeta;
    private String nomeMeta;
    private double saldoMeta;
    private String descricaoMeta;
    private double aporteMensal;

    public Meta(double valorMeta, String nomeMeta, double saldoMeta, String descricaoMeta){
        this.valorMeta = valorMeta;
        this.nomeMeta = nomeMeta;
        this.saldoMeta = saldoMeta;
        this.descricaoMeta = descricaoMeta;

    }
    void calcularTempoMeta(){
        int mesesConclusaoMeta = (int) ((valorMeta-saldoMeta) / aporteMensal);

        System.out.println("Você irá demorar "+mesesConclusaoMeta+" meses para concluir a meta "+nomeMeta);

    }


}
