package com.mbayne.lc;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mbayne.utils.ValueObjectFormatter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSummary {
  private Integer investorId;
  private BigDecimal availableCash;
  private BigDecimal accountTotal;
  private BigDecimal accruedInterest;
  private BigDecimal infundingBalance;
  private BigDecimal receivedInterest;
  private BigDecimal receivedPrincipal;
  private BigDecimal receivedLateFees;
  private BigDecimal outstandingPrincipal;
  private Integer totalNotes;
  private Integer totalPortfolios;

  public Integer getInvestorId() {
    return investorId;
  }
  public void setInvestorId(Integer investorId) {
    this.investorId=investorId;
  }
  public BigDecimal getAvailableCash() {
    return availableCash;
  }
  public void setAvailableCash(BigDecimal availableCash) {
    this.availableCash=availableCash;
  }
  public BigDecimal getAccountTotal() {
    return accountTotal;
  }
  public void setAccountTotal(BigDecimal accountTotal) {
    this.accountTotal=accountTotal;
  }
  public BigDecimal getAccruedInterest() {
    return accruedInterest;
  }
  public void setAccruedInterest(BigDecimal accruedInterest) {
    this.accruedInterest=accruedInterest;
  }
  public BigDecimal getInfundingBalance() {
    return infundingBalance;
  }
  public void setInfundingBalance(BigDecimal infundingBalance) {
    this.infundingBalance=infundingBalance;
  }
  public BigDecimal getReceivedInterest() {
    return receivedInterest;
  }
  public void setReceivedInterest(BigDecimal receivedInterest) {
    this.receivedInterest=receivedInterest;
  }
  public BigDecimal getReceivedPrincipal() {
    return receivedPrincipal;
  }
  public void setReceivedPrincipal(BigDecimal receivedPrincipal) {
    this.receivedPrincipal=receivedPrincipal;
  }
  public BigDecimal getReceivedLateFees() {
    return receivedLateFees;
  }
  public void setReceivedLateFees(BigDecimal receivedLateFees) {
    this.receivedLateFees=receivedLateFees;
  }
  public BigDecimal getOutstandingPrincipal() {
    return outstandingPrincipal;
  }
  public void setOutstandingPrincipal(BigDecimal outstandingPrinc) {
    this.outstandingPrincipal=outstandingPrincipal;
  }
  public Integer getTotalNotes() {
    return totalNotes;
  }
  public void setTotalNotes(Integer totalNotes) {
    this.totalNotes=totalNotes;
  }
  public Integer getTotalPortfolios() {
    return totalPortfolios;
  }
  public void setTotalPortfolios(Integer totalPortfolios) {
    this.totalPortfolios=totalPortfolios;
  }
  public String toString(int offset) {
    ValueObjectFormatter formatter =
      new ValueObjectFormatter("AccountSummary", offset);
    formatter.append("inverstorId", investorId);
    formatter.append("availableCash", availableCash);
    formatter.append("accountTotal", accountTotal);
    formatter.append("accruedInterest", accruedInterest);
    formatter.append("infundingBalance", infundingBalance);
    formatter.append("receivedInterest", receivedInterest);
    formatter.append("receivedPrincipal", receivedPrincipal);
    formatter.append("receivedLateFees", receivedLateFees);
    formatter.append("outstandingPrincipal", outstandingPrincipal);
    formatter.append("totalNotes", totalNotes);
    formatter.append("totalPortfolios", totalPortfolios);
    return(formatter.format());
  }

  @Override
  public String toString() {
    return(toString(0));
  } 
}
