public class ColecaoBrinquedos {

   Brinquedo []  brinquedos = new Brinquedo[5];

   public void adicionarBrinquedos(Brinquedo brinquedo){

      for (int i = 0; i < brinquedos.length; i++) {
         if (this.brinquedos[i] == null) {
             brinquedos[i] = brinquedo;
            break;
         }


      }
   }

   //Listando os brinquedos
   public void listarBrinquedos(){
      System.out.println("----LISTA DE BRINQUEDOS-------");

      for (int i = 0; i < brinquedos.length; i++) {
         if (brinquedos[i] != null) {

            if (brinquedos[i] instanceof Carrinho) {

               System.out.println("Carrinho");

            } else if (brinquedos[i] instanceof Aviao) {

               System.out.println("Avião");

            } else if (brinquedos[i] instanceof Barco) {
               System.out.println("Barco");

            }
         }
      }
   }

}
