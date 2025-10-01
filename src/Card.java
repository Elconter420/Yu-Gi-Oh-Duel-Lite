public class Card {
    private String nombre;
    private String atk;
    private String def;
    private String imagen;
    private boolean selected = false;

    public Card(String nombre, String atk, String def, String imagen) {
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isSelected() {return selected;}
    public void setSelected(boolean selected) {this.selected = selected;}

    @Override
    public String toString(){
        return String.format("%s (ATK: %s / DEF: %s)", nombre, atk, def);
    }
}
