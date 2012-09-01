/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.routines;

/**
 * This class is generated by jOOQ.
 *
 * Provides a customizable report on best customers
 */
@java.lang.SuppressWarnings("all")
public class RewardsReport extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -2004720273;


	/**
	 * The procedure parameter <code>sakila.rewards_report.min_monthly_purchases</code>
	 */
	public static final org.jooq.Parameter<java.lang.Byte> MIN_MONTHLY_PURCHASES = createParameter("min_monthly_purchases", org.jooq.impl.SQLDataType.TINYINT);

	/**
	 * The procedure parameter <code>sakila.rewards_report.min_dollar_amount_purchased</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> MIN_DOLLAR_AMOUNT_PURCHASED = createParameter("min_dollar_amount_purchased", org.jooq.impl.SQLDataType.DECIMAL);

	/**
	 * The procedure parameter <code>sakila.rewards_report.count_rewardees</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> COUNT_REWARDEES = createParameter("count_rewardees", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public RewardsReport() {
		super("rewards_report", org.jooq.examples.mysql.sakila.Sakila.SAKILA);

		addInParameter(MIN_MONTHLY_PURCHASES);
		addInParameter(MIN_DOLLAR_AMOUNT_PURCHASED);
		addOutParameter(COUNT_REWARDEES);
	}

	/**
	 * Set the <code>min_monthly_purchases</code> parameter IN value to the routine
	 */
	public void setMinMonthlyPurchases(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.routines.RewardsReport.MIN_MONTHLY_PURCHASES, value);
	}

	/**
	 * Set the <code>min_dollar_amount_purchased</code> parameter IN value to the routine
	 */
	public void setMinDollarAmountPurchased(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.routines.RewardsReport.MIN_DOLLAR_AMOUNT_PURCHASED, value);
	}

	/**
	 * Get the <code>count_rewardees</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getCountRewardees() {
		return getValue(COUNT_REWARDEES);
	}
}
