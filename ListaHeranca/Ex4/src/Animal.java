public abstract class Animal {
        private String nome;
        private float comprimento;
        private int numPatas;
        private String cor;
        private String ambiente;
        private float velocMedia;

        public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia) {
            this.nome = nome;
            this.comprimento = comprimento;
            this.numPatas = numPatas;
            this.cor = cor;
            this.ambiente = ambiente;
            this.velocMedia = velocMedia;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getComprimento() {
            return comprimento;
        }

        public void setComprimento(float comprimento) {
            this.comprimento = comprimento;
        }

        public int getNumPatas() {
            return numPatas;
        }

        public void setNumPatas(int numPatas) {
            this.numPatas = numPatas;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getAmbiente() {
            return ambiente;
        }

        public void setAmbiente(String ambiente) {
            this.ambiente = ambiente;
        }

        public float getVelocMedia() {
            return velocMedia;
        }

        public void setVelocMedia(float velocMedia) {
            this.velocMedia = velocMedia;
        }

        public String exibirDados(){
            return "\n  Nome: " + getNome() +
                    "\n  Comprimento: " + getComprimento() + " cm" +
                    "\n  Número de patas: " + getNumPatas() +
                    "\n  Cor: " + getCor() +
                    "\n  Ambiente: " + getAmbiente() +
                    "\n  Velocidade média: " + getVelocMedia() + " km/h ";
        }
    }
