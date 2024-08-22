public abstract class Beverage {
    private boolean  wantsExtras;

    //Add a final Template method

    public final void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(wantsExtras){
            addExtras();
        }

    }
    //Concrete methods
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    //Abstract methods to be implement by subclasses
    public abstract void brew();
    public abstract void addCondiments();
    public abstract void addExtras();

    //Method to set wantsExtras field
    public void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }
}
