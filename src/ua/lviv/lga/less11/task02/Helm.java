package ua.lviv.lga.less11.task02;

public class Helm {
    private int diameter;
    private  HelmMaterials helmMaterials;

    public Helm(int diameter, HelmMaterials helmMaterials) {
        this.diameter = diameter;
        this.helmMaterials = helmMaterials;
    }

    public Helm(int diameter, String material) {
        this.diameter = diameter;

    }

    public int getDiameter() {
        return diameter;
    }

    public HelmMaterials getHelmMaterials() {
        return helmMaterials;
    }

    public void setHelmMaterials(HelmMaterials helmMaterials) {
        this.helmMaterials = helmMaterials;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", helmMaterials=" + helmMaterials +
                '}';
    }
}
