package Project3;

public class Fertilizer{
    private int nutac_Hi_N;
    private int nutac_Extra_P;
    private int nutac_Super_K;
    private int goemar_Nano;
    private int goemar_XL;
    private int fomax_Boron_150;
    private int fomax_Calsium_Boron_400;
    private int nuba_Spray_Calsium_Boron;
    private int amani;

    private int water;

    Fertilizer(int water,int nutac_Hi_N, int nutac_Extra_P, int nutac_Super_K, int goemar_Nano, int goemar_XL, int fomax_Boron_150, int fomax_Calsium_Boron_400, int nuba_Spray_Calsium_Boron, int amani){
        this.water = water;
        this.nutac_Hi_N = nutac_Hi_N;
        this.nutac_Extra_P = nutac_Extra_P;
        this.nutac_Super_K = nutac_Super_K;
        this.goemar_Nano = goemar_Nano;
        this.goemar_XL = goemar_XL;
        this.fomax_Boron_150 = fomax_Boron_150;
        this.fomax_Calsium_Boron_400 = fomax_Calsium_Boron_400;
        this.nuba_Spray_Calsium_Boron = nuba_Spray_Calsium_Boron;
        this.amani = amani;
    }

    //ระยะแตกใบอ่อน - Phase1
    static boolean canMixFertPhase_1(int nutac_Hi_N,int goemar_Nano){
        return nutac_Hi_N >= 20 && 
            goemar_Nano >= 20;
    }

    //ระยะสะสมอาหาร - Phase2
    static boolean canMixFertPhase_2(int nutac_Super_K,int nutac_Extra_P,int amani){
        return nutac_Super_K >= 30 && 
            nutac_Extra_P >= 50 && 
            amani >= 20;
    }
    
    //ระยะเริ่มแทงช่อดอก - Phase3
    static boolean canMixFertPhase_3(int nutac_Super_K,int goemar_Nano,int nuba_Spray_Calsium_Boron){
        return nutac_Super_K >= 30 && 
            goemar_Nano >= 20 && 
            nuba_Spray_Calsium_Boron >= 5;
    }

    //ระยะก่อนดอกบาน - Phase4
    static boolean canMixFertPhase_4(int nutac_Super_K,int fomax_Calsium_Boron_400,int fomax_Boron_150){
        return nutac_Super_K >= 30 && 
            fomax_Calsium_Boron_400 >= 10 && 
            fomax_Boron_150 >= 10;
    }

    //ระยะติดผล - Phase5
    static boolean canMixFertPhase_5(int nutac_Hi_N,int fomax_Calsium_Boron_400,int goemar_XL){
        return nutac_Hi_N >= 20 && 
            fomax_Calsium_Boron_400 >= 10 && 
            goemar_XL >= 10;
    }

    //ระยะขยายขนาดผล - Phase6
    static boolean canMixFertPhase_6(int nutac_Hi_N,int fomax_Calsium_Boron_400){
        return nutac_Hi_N >= 20 && 
            fomax_Calsium_Boron_400 >= 10;
    }

    //ระยะก่อนเก็บเกี่ยว 1 เดือน - Phase7
    static boolean canMixFertPhase_7(int nutac_Super_K,int fomax_Calsium_Boron_400){
        return nutac_Super_K >= 10 && 
            fomax_Calsium_Boron_400 >= 10;
    }

    //Mix Phase1
    public static void mixFert1(int nutac_Hi_N,int goemar_Nano){
        if(canMixFertPhase_1(nutac_Hi_N, goemar_Nano)){
            nutac_Hi_N -= nutac_Hi_N;
            goemar_Nano -= goemar_Nano;
            System.out.println("Mixing Fertilizer!");
        }else{
            System.out.println("Not enough resource!");
        }
    }

    //Mix Phase2
    public static void mixFert2(int nutac_Super_K,int nutac_Extra_P,int amani){
        if(canMixFertPhase_2(nutac_Super_K,nutac_Extra_P,amani)){
            nutac_Super_K -= nutac_Super_K;
            nutac_Extra_P -= nutac_Extra_P;
            amani -= amani;
            System.out.println("Mixing Fertilizer!");
        }else{
            System.out.println("Not enough resource!");
        }
    }

    //Mix Phase3
    public static void mixFert3(int nutac_Super_K,int goemar_Nano,int nuba_Spray_Calsium_Boron){
        if(canMixFertPhase_3(nutac_Super_K, goemar_Nano, nuba_Spray_Calsium_Boron)){
            nutac_Super_K -= nutac_Super_K;
            goemar_Nano -= goemar_Nano;
            nuba_Spray_Calsium_Boron -= nuba_Spray_Calsium_Boron;
            System.out.println("Mixing Fertilizer!");
        }else{
            System.out.println("Not enough resource!");
        }
    }

    //Mix Phase4
    public static void mixFert4(int nutac_Super_K,int fomax_Calsium_Boron_400,int fomax_Boron_150){
        if(canMixFertPhase_4(nutac_Super_K, fomax_Calsium_Boron_400, fomax_Boron_150)){
            nutac_Super_K -= nutac_Super_K;
            fomax_Calsium_Boron_400 -= fomax_Calsium_Boron_400;
            fomax_Boron_150 -= fomax_Boron_150;
            System.out.println("Mixing Fertilizer!");
        }else{
            System.out.println("Not enough resource!");
        }
    }

    //Mix Phase5
    public static void mixFert5(int nutac_Hi_N,int fomax_Calsium_Boron_400,int goemar_XL){
        if(canMixFertPhase_5(nutac_Hi_N, fomax_Calsium_Boron_400, goemar_XL)){
            nutac_Hi_N -= nutac_Hi_N;
            fomax_Calsium_Boron_400 -= fomax_Calsium_Boron_400;
            goemar_XL -= goemar_XL;
            System.out.println("Mixing Fertilizer!");
        }else{
            System.out.println("Not enough resource!");
        }
    }

    //Mix Phase6
    public static void mixFert6(int nutac_Hi_N,int fomax_Calsium_Boron_400){
        if(canMixFertPhase_6(nutac_Hi_N, fomax_Calsium_Boron_400)){
            nutac_Hi_N -= nutac_Hi_N;
            fomax_Calsium_Boron_400 -= fomax_Calsium_Boron_400;
            System.out.println("Mixing Fertilizer!");
        }else{
            System.out.println("Not enough resource!");
        }
    }

    //Mix Phase7
    public static void mixFert7(int nutac_Super_K,int fomax_Calsium_Boron_400){
        if(canMixFertPhase_7(nutac_Super_K, fomax_Calsium_Boron_400)){
            nutac_Super_K -= nutac_Super_K;
            fomax_Calsium_Boron_400 -= fomax_Calsium_Boron_400;
            System.out.println("Mixing Fertilizer!");
        }else{
            System.out.println("Not enough resource!");
        }
    }

    //Fertilizer and Water Ratio
    public double ratio(int water_mL){
        double water_L = water_mL/1000;
        return water_L/20;
    }

    //Resource Remaining
    public void printRemain(){
        System.out.println(water);
        System.out.println(nutac_Hi_N);
        System.out.println(nutac_Extra_P);
        System.out.println(nutac_Super_K);
        System.out.println(goemar_Nano);
        System.out.println(goemar_XL);
        System.out.println(fomax_Boron_150);
        System.out.println(fomax_Calsium_Boron_400);
        System.out.println(nuba_Spray_Calsium_Boron);
        System.out.println(amani);
    }
}
