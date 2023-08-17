public class Gizmo
{
    private String maker;
    private boolean electronic;

    public Gizmo(String maker, boolean isElectronic) {
        this.maker = maker;
        this.electronic = isElectronic;
    }

    public String getMaker()
    {
        return maker;
    }

    public boolean isElectronic()
    {
        return electronic;
    }

    public boolean equals(Object other)
    {
        if(!(other instanceof Gizmo)) return false;

        Gizmo that = (Gizmo) other;
        return this.maker.equals(that.maker)
                && this.electronic == that.electronic;
    }

}
