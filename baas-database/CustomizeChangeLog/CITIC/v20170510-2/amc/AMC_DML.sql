--  holo 云盘服务-300036 surdoc 云盘服务-300037  CNKI-300038
INSERT INTO `amc_dr_bill_subject_map` (`TENANT_ID`, `DR_SUBJECT`, `BILL_SUBJECT`) VALUES ('ECITIC', 'HOLA01', '300036');   
INSERT INTO `amc_dr_bill_subject_map` (`TENANT_ID`, `DR_SUBJECT`, `BILL_SUBJECT`) VALUES ('ECITIC', 'SURDOC01', '300037');  
INSERT INTO `amc_dr_bill_subject_map` (`TENANT_ID`, `DR_SUBJECT`, `BILL_SUBJECT`) VALUES ('ECITIC', 'CNKI01', '300038');  
INSERT INTO `amc_deduct_rule` (`TENANT_ID`, `FUND_SUBJECT`, `FEE_SUBJECT`) VALUES ('ECITIC', '100001', '300036');
INSERT INTO `amc_deduct_rule` (`TENANT_ID`, `FUND_SUBJECT`, `FEE_SUBJECT`) VALUES ('ECITIC', '100001', '300037');
INSERT INTO `amc_deduct_rule` (`TENANT_ID`, `FUND_SUBJECT`, `FEE_SUBJECT`) VALUES ('ECITIC', '100001', '300038');
commit;
