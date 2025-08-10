maritalstatus <- factor(c("Married", "Single", "Divorce"))
print(maritalstatus)
check = is.factor(maritalstatus)
print(check)
maritalstatus[c(2,4)]