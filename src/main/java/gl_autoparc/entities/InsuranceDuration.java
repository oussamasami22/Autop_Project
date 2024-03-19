package gl_autoparc.entities;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InsuranceDuration {
    MONTH(1), THREE_MONTH(3), SIX_MONTH(6), YEAR(12);

    private Integer numberOfMonth;

    InsuranceDuration(Integer numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    @JsonValue
    public Integer getNumberOfMonth() {
        return numberOfMonth;

    }
}
/*@JsonValue est utilisé pour indiquer que la méthode getNumberOfMonth()
doit être utilisée pour sérialiser les valeurs de l'énumération lors
de la sérialisation/désérialisation JSON. Cela signifie que lorsque
vous sérialisez un objet InsuranceDuration, la valeur associée à chaque
 constante de l'énumération sera la valeur retournée par la méthode getNumberOfMonth().
 */