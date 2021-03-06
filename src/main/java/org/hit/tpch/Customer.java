package org.hit.tpch;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.Locale.ENGLISH;

public class Customer
        implements TpchEntity
{
    private final long rowNumber;
    
    private final long customerKey;
    private final String name;
    private final String address;
    private final long nationKey;
    private final String phone;
    private final long accountBalance;
    private final String marketSegment;
    private final String comment;

    public Customer(long rowNumber, long customerKey, String name, String address, long nationKey, String phone, long accountBalance, String marketSegment, String comment)
    {
        this.rowNumber = rowNumber;
        this.customerKey = customerKey;
        this.name = checkNotNull(name, "name is null");
        this.address = checkNotNull(address, "address is null");
        this.nationKey = nationKey;
        this.phone = checkNotNull(phone, "phone is null");
        this.accountBalance = accountBalance;
        this.marketSegment = checkNotNull(marketSegment, "marketSegment is null");
        this.comment = checkNotNull(comment, "comment is null");
    }

    @Override
    public long getRowNumber()
    {
        return rowNumber;
    }

    public long getCustomerKey()
    {
        return customerKey;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public long getNationKey()
    {
        return nationKey;
    }

    public String getPhone()
    {
        return phone;
    }

    public double getAccountBalance()
    {
        return accountBalance / 100.0;
    }

    public long getAccountBalanceInCents()
    {
        return accountBalance;
    }

    public String getMarketSegment()
    {
        return marketSegment;
    }

    public String getComment()
    {
        return comment;
    }

    @Override
    public String toLine()
    {
        return String.format(ENGLISH,
                "%d|%s|%s|%d|%s|%s|%s|%s|",
                customerKey,
                name,
                address,
                nationKey,
                phone,
                GenerateUtils.formatMoney(accountBalance),
                marketSegment,
                comment);
    }
    public static void main(String[] args) {
		long lo= 5989;
		System.out.println(GenerateUtils.formatMoney(lo));
	}
}
