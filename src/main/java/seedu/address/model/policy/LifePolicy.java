package seedu.address.model.policy;

import java.time.LocalDate;
import java.time.Period;

/**
 * A Policy of type Life.
 */
public class LifePolicy extends Policy {
    private static final double DEFAULT_PREMIUM_AMOUNT = 100;
    private static final double DEFAULT_COVERAGE_AMOUNT = 10000;
    private static final Period DEFAULT_EXPIRY_DATE_PERIOD = Period.ofYears(20);

    /**
     * Constructor for a new LifePolicy initialized with defaults.
     */
    public LifePolicy() {
        super(DEFAULT_PREMIUM_AMOUNT, DEFAULT_COVERAGE_AMOUNT, LocalDate.now().plus(DEFAULT_EXPIRY_DATE_PERIOD));
    }

    /**
     * Constructor for a new LifePolicy with all its fields initialized.
     *
     * @param premiumAmount the price of the policy, paid per month.
     * @param coverageAmount the maximum amount that can be claimed under this policy.
     * @param expiryDate the date of Policy's expiry.
     * @throws IllegalArgumentException if the premiumAmount or coverageAmount is negative.
     * @throws NullPointerException if the given expiryDate or insuree is null.
     */
    public LifePolicy(double premiumAmount, double coverageAmount, LocalDate expiryDate) {
        super(premiumAmount, coverageAmount, expiryDate);
    }

    @Override
    public PolicyType getType() {
        return PolicyType.LIFE;
    }

    @Override
    public String toString() {
        return String.format("Policy type: %s | ", getType()) + super.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof LifePolicy)) {
            return false;
        }

        LifePolicy p = (LifePolicy) other;
        return super.equals(p);
    }
}
