class InfosisEnergycode{

    public static void EnergyCalculte(int []Exer,int N,int E){

        System.out.println("The energy: "+E);
        System.out.println("The Number of Exercise possible: "+N);

        int count=0;
        int sum=0;

        // calculate total exercise energy
        for(int i=0;i<N;i++){
            sum+=Exer[i];
        }

        // check if possible
        if(2*sum<E){
            System.out.println("I am So Tired & energy=-1");
            return;
        }

        // perform exercises
        while(E>0){
            for(int i=0;i<N;i++){
                for(int j=0;j<2;j++){

                    E=E-Exer[i];
                    count++;

                    if(E<=0){
                        System.out.println("How many Exercise done: "+count);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        int E=10;
        int N=2;
        int Exer[] = {1,2};

        EnergyCalculte(Exer, N, E);
    }
}