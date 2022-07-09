import java.util.Objects;

public class Bet {
    int var;


    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return var == bet.var;
    }

    @Override
    public int hashCode() {
        return Objects.hash(var);
    }

    @Override
    public String toString() {
        return "Bet{" +
                "var=" + var +
                '}';
    }
}
