
public enum CoinType {

    ONE(0.01, false),
    TWO(0.02, false),
    FIVE(0.05, true),
    TEN(0.10, true),
    TWENTY(0.20, true),
    FIFTY(0.50, true),
    ONE£(1.0, true),
    TWO£(2.0, true),
    ;


    private final double value;
    private final boolean accepted;

    CoinType(double value, boolean accepted) {
        this.value = value;
        this.accepted = accepted;
    }
}
