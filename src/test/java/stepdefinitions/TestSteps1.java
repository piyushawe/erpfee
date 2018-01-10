package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.reports.*;
import pageobjects.transactionreport.*;

import static webdriver.AppDriver.driver;
public class TestSteps1 {

    @When("^user open class wise student details$")
    public void user_open_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).openClassWiseStudentDetails();
    }

    @When("^select school with index \"([^\"]*)\" on class wise student details$")
    public void select_school_with_index_on_class_wise_student_details(int arg1) throws Throwable {
        new ClassWiseStudentDetails(driver).selectSchool(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on class wise student details$")
    public void select_class_with_index_on_class_wise_student_details(int arg1) throws Throwable {
        new ClassWiseStudentDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class wise student details$")
    public void select_section_with_index_on_class_wise_student_details(int arg1) throws Throwable {
        new ClassWiseStudentDetails(driver).selectSection(arg1);
    }

    @Then("^click show on class wise student details$")
    public void click_show_on_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).clickShow();
    }

    @When("^select day scholar or boarding on class wise student details$")
    public void select_day_scholar_or_boarding_on_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).selectDayScholarBoarding();
    }

    @When("^select show roll no on class wise student details$")
    public void select_show_roll_no_on_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).selectShowRollNo();
    }

//class section transfer report
    @When("^user open class section transfer report$")
    public void user_open_class_section_transfer_report() throws Throwable {
        new ClassSectionTransferReport(driver).openClassSectionTransferReport();
    }

    @When("^select class with index \"([^\"]*)\" on class section transfer report$")
    public void select_class_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class section transfer report$")
    public void select_section_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectSection(arg1);
    }

    @When("^select old academic year with index \"([^\"]*)\" on class section transfer report$")
    public void select_old_academic_year_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectOldAcademicYear(arg1);
    }

    @When("^select old financial year with index \"([^\"]*)\" on class section transfer report$")
    public void select_old_financial_year_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectOldFinancialYear(arg1);
    }

    @Then("^click show on class section transfer report$")
    public void click_show_on_class_section_transfer_report() throws Throwable {
        new ClassSectionTransferReport(driver).clickShow();
    }

//class wise sibling
    @When("^user open class wise sibling$")
    public void user_open_class_wise_sibling() throws Throwable {
        new ClassWiseSibling(driver).openClassWiseSibling();
    }

    @When("^select class with index \"([^\"]*)\" on class wise sibling$")
    public void select_class_with_index_on_class_wise_sibling(int arg1) throws Throwable {
        new ClassWiseSibling(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class wise sibling$")
    public void select_section_with_index_on_class_wise_sibling(int arg1) throws Throwable {
        new ClassWiseSibling(driver).selectSection(arg1);
    }

    @Then("^click show on class wise sibling$")
    public void click_show_on_class_wise_sibling() throws Throwable {
       new ClassWiseSibling(driver).clickShow();
    }

//class wise mark list
    @When("^user open class wise mark list$")
    public void user_open_class_wise_mark_list() throws Throwable {
        new ClassWiseMarkList(driver).openClassWiseMarkList();
    }

    @When("^select class with index \"([^\"]*)\" on class wise mark list$")
    public void select_class_with_index_on_class_wise_mark_list(int arg1) throws Throwable {
        new ClassWiseMarkList(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class wise mark list$")
    public void select_section_with_index_on_class_wise_mark_list(int arg1) throws Throwable {
        new ClassWiseMarkList(driver).selectSection(arg1);
    }

    @When("^select order by with index \"([^\"]*)\" on class wise mark list$")
    public void select_order_by_with_index_on_class_wise_mark_list(int arg1) throws Throwable {
        new ClassWiseMarkList(driver).selectOrderBy(arg1);
    }

    @Then("^click show on class wise mark list$")
    public void click_show_on_class_wise_mark_list() throws Throwable {
        new ClassWiseMarkList(driver).clickShow();
    }

//student register date wise report
    @When("^user open student register date wise report$")
    public void user_open_student_register_date_wise_report() throws Throwable {
        new StudentRegisterDateWiseReport(driver).openStudentRegisterDateWiseReport();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on student register date wise report$")
    public void select_from_date_as_month_year_and_day_on_student_register_date_wise_report(String arg1, String arg2, String arg3) throws Throwable {
        new StudentRegisterDateWiseReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select class with index \"([^\"]*)\" on student register date wise report$")
    public void select_class_with_index_on_student_register_date_wise_report(int arg1) throws Throwable {
        new StudentRegisterDateWiseReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on student register date wise report$")
    public void select_section_with_index_on_student_register_date_wise_report(int arg1) throws Throwable {
        new StudentRegisterDateWiseReport(driver).selectSection(arg1);
    }

    @Then("^click show on student register date wise report$")
    public void click_show_on_student_register_date_wise_report() throws Throwable {
        new StudentRegisterDateWiseReport(driver).clickShow();
    }

//mid year student details
    @When("^user open mid year student details$")
    public void user_open_mid_year_student_details() throws Throwable {
        new MidYearStudentDetails(driver).openMidYearStudentDetails();
    }

    @When("^select class with index \"([^\"]*)\" on mid year student details$")
    public void select_class_with_index_on_mid_year_student_details(int arg1) throws Throwable {
        new MidYearStudentDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on mid year student details$")
    public void select_section_with_index_on_mid_year_student_details(int arg1) throws Throwable {
        new MidYearStudentDetails(driver).selectSection(arg1);
    }

    @Then("^click show on mid year student details$")
    public void click_show_on_mid_year_student_details() throws Throwable {
        new MidYearStudentDetails(driver).clickShow();
    }

//active inactive student details report
    @When("^user open active inactive student details report$")
    public void user_open_active_inactive_student_details_report() throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).openActiveInactiveStudentsDetailReport();
    }

    @When("^select class with index \"([^\"]*)\" on active inactive student details report$")
    public void select_class_with_index_on_active_inactive_student_details_report(int arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on active inactive student details report$")
    public void select_section_with_index_on_active_inactive_student_details_report(int arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectSection(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on active inactive student details report$")
    public void select_user_with_index_on_active_inactive_student_details_report(int arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectUser(arg1);
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on active inactive student details report$")
    public void select_from_date_as_month_year_and_day_on_active_inactive_student_details_report(String arg1, String arg2, String arg3) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on active inactive student details report$")
    public void click_show_on_active_inactive_student_details_report() throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on active inactive student details report$")
    public void select_radio_button_on_active_inactive_student_details_report(String arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).clickButton(arg1);
    }

//staff ward list report
    @When("^user open staff ward list report$")
    public void user_open_staff_ward_list_report() throws Throwable {
        new StaffWardListReport(driver).openStaffWardListReport();
    }

    @When("^select class with index \"([^\"]*)\" on staff ward list report$")
    public void select_class_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on staff ward list report$")
    public void select_section_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectSection(arg1);
    }

    @When("^select staff type with index \"([^\"]*)\" on staff ward list report$")
    public void select_staff_type_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectStaffType(arg1);
    }

    @When("^select staff name with index \"([^\"]*)\" on staff ward list report$")
    public void select_staff_name_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectStaffName(arg1);
    }

    @Then("^click show on staff ward list report$")
    public void click_show_on_staff_ward_list_report() throws Throwable {
        new StaffWardListReport(driver).clickShow();
    }

//group wise student details
    @When("^user open group wise student details$")
    public void user_open_group_wise_student_details() throws Throwable {
        new GroupWiseStudentDetails(driver).openGroupWiseStudentDetails();
    }

    @When("^select class with index \"([^\"]*)\" on group wise student details$")
    public void select_class_with_index_on_group_wise_student_details(int arg1) throws Throwable {
        new GroupWiseStudentDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on group wise student details$")
    public void select_section_with_index_on_group_wise_student_details(int arg1) throws Throwable {
        new GroupWiseStudentDetails(driver).selectSection(arg1);
    }

    @When("^select group with index \"([^\"]*)\" on group wise student details$")
    public void select_group_with_index_on_group_wise_student_details(int arg1) throws Throwable {
        new GroupWiseStudentDetails(driver).selectGroup(arg1);
    }

    @Then("^click show on group wise student details$")
    public void click_show_on_group_wise_student_details() throws Throwable {
         new GroupWiseStudentDetails(driver).clickShow();
    }

//sms report
    @When("^user open sms report$")
    public void user_open_sms_report() throws Throwable {
        new SmsReport(driver).openSmsReport();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on sms report$")
    public void select_from_date_as_month_year_and_day_on_sms_report(String arg1, String arg2, String arg3) throws Throwable {
        new SmsReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select sms type with index \"([^\"]*)\" on sms report$")
    public void select_sms_type_with_index_on_sms_report(int arg1) throws Throwable {
        new SmsReport(driver).selectSmsType(arg1);
    }

    @Then("^click show on sms report$")
    public void click_show_on_sms_report() throws Throwable {
        new SmsReport(driver).clickShow();
    }

//refund amount
    @When("^user open refund amount$")
    public void user_open_refund_amount() throws Throwable {
        new RefundAmount(driver).openRefundAmount();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on refund amount$")
    public void select_from_date_as_month_year_and_day_on_refund_amount(String arg1, String arg2, String arg3) throws Throwable {
        new RefundAmount(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select year with index \"([^\"]*)\" on refund amount$")
    public void select_year_with_index_on_refund_amount(int arg1) throws Throwable {
        new RefundAmount(driver).selectYear(arg1);
    }

    @Then("^click show on refund amount$")
    public void click_show_on_refund_amount() throws Throwable {
        new RefundAmount(driver).clickShow();
    }

//opening dues report
    @When("^user open opening dues report$")
    public void user_open_opening_dues_report() throws Throwable {
        new OpeningDuesReport(driver).openOpeningDuesReport();
    }

    @When("^select school with index \"([^\"]*)\" on opening dues report$")
    public void select_school_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectSchool(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on opening dues report$")
    public void select_class_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on opening dues report$")
    public void select_section_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectSection(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on opening dues report$")
    public void select_fee_type_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectFeeType(arg1);
    }

    @When("^select installment with index \"([^\"]*)\" on opening dues report$")
    public void select_installment_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectInstallment(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on opening dues report$")
    public void select_user_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectUser(arg1);
    }

    @Then("^click show on opening dues report$")
    public void click_show_on_opening_dues_report() throws Throwable {
        new OpeningDuesReport(driver).clickShow();
    }

//student health entry report
    @When("^user open student health entry report$")
    public void user_open_student_health_entry_report() throws Throwable {
        new StudentHealthEntryReport(driver).openStudentHealthEntryReport();
    }

    @When("^select class on student health entry report$")
    public void select_class_on_student_health_entry_report() throws Throwable {
        new StudentHealthEntryReport(driver).selectClass();
    }

    @Then("^click show on student health entry report$")
    public void click_show_on_student_health_entry_report() throws Throwable {
        new StudentHealthEntryReport(driver).clickShow();
    }

//transport detail
    @When("^user open transport detail$")
    public void user_open_transport_detail() throws Throwable {
        new TransportDetail(driver).openTransportDetail();
    }

    @When("^select route with index \"([^\"]*)\" on transport detail$")
    public void select_route_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectRoute(arg1);
    }

    @When("^select stop with index \"([^\"]*)\" on transport detail$")
    public void select_stop_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectStop(arg1);
    }

    @When("^select vehicle with index \"([^\"]*)\" on transport detail$")
    public void select_vehicle_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectvehicle(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on transport detail$")
    public void select_class_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on transport detail$")
    public void select_section_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectSection(arg1);
    }

    @When("^select vendor with index \"([^\"]*)\" on transport detail$")
    public void select_vendor_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectvendor(arg1);
    }

    @When("^select installment on transport detail$")
    public void select_installment_on_transport_detail() throws Throwable {
        new TransportDetail(driver).selectInstallment();
    }

    @Then("^click show on transport detail$")
    public void click_show_on_transport_detail() throws Throwable {
        new TransportDetail(driver).clickShow();
    }

//amount without structure for staff
    @Then("^user open amount without structure for staff report$")
    public void user_open_amount_without_structure_for_staff_report() throws Throwable {
        new AmountWithoutStructureForStaff(driver).openAmountWithoutStructureForStaff();
    }

    @Then("^select year with index \"([^\"]*)\" on amount without structure for staff$")
    public void select_year_with_index_on_amount_without_structure_for_staff(int arg1) throws Throwable {
        new AmountWithoutStructureForStaff(driver).selectYear(arg1);
    }

    @Then("^select school with index \"([^\"]*)\" on amount without structure for staff$")
    public void select_school_with_index_on_amount_without_structure_for_staff(int arg1) throws Throwable {
       new AmountWithoutStructureForStaff(driver).selectSchool(arg1);
    }

    @Then("^select staff type with index \"([^\"]*)\" on amount without structure for staff$")
    public void select_staff_type_with_index_on_amount_without_structure_for_staff(int arg1) throws Throwable {
        new AmountWithoutStructureForStaff(driver).selectStaffType(arg1);
    }

    @Then("^select designation with index \"([^\"]*)\" on amount without structure for staff$")
    public void select_designation_with_index_on_amount_without_structure_for_staff(int arg1) throws Throwable {
        new AmountWithoutStructureForStaff(driver).selectDesignation(arg1);
    }

    @Then("^select department with index \"([^\"]*)\" on amount without structure for staff$")
    public void select_department_with_index_on_amount_without_structure_for_staff(int arg1) throws Throwable {
        new AmountWithoutStructureForStaff(driver).selectDepartment(arg1);
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on amount without structure for staff$")
    public void select_from_date_as_month_year_and_day_on_amount_without_structure_for_staff(String arg1, String arg2, String arg3) throws Throwable {
        new AmountWithoutStructureForStaff(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select user with index \"([^\"]*)\" on amount without structure for staff$")
    public void select_user_with_index_on_amount_without_structure_for_staff(int arg1) throws Throwable {
        new AmountWithoutStructureForStaff(driver).selectUser(arg1);
    }

    @Then("^click cancelled fee on amount without structure for staff$")
    public void click_cancelled_fee_on_amount_without_structure_for_staff() throws Throwable {
        new AmountWithoutStructureForStaff(driver).clickCancelledFee();
    }

    @Then("^click show on amount without structure for staff$")
    public void click_show_on_amount_without_structure_for_staff() throws Throwable {
        new AmountWithoutStructureForStaff(driver).clickShow();
    }

//student amount fee type wise
    @When("^user open student amount fee type wise$")
    public void user_open_student_amount_fee_type_wise() throws Throwable {
        new StudentAmountFeeTypeWise(driver).openStudentAmountFeeTypeWise();
    }

    @When("^select class with index \"([^\"]*)\" on student amount fee type wise$")
    public void select_class_with_index_on_student_amount_fee_type_wise(int arg1) throws Throwable {
        new StudentAmountFeeTypeWise(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on student amount fee type wise$")
    public void select_section_with_index_on_student_amount_fee_type_wise(int arg1) throws Throwable {
        new StudentAmountFeeTypeWise(driver).selectSection(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on student amount fee type wise$")
    public void select_fee_type_with_index_on_student_amount_fee_type_wise(int arg1) throws Throwable {
        new StudentAmountFeeTypeWise(driver).selectFeeType(arg1);
    }

    @When("^select concession on student amount fee type wise$")
    public void select_concession_on_student_amount_fee_type_wise() throws Throwable {
        new StudentAmountFeeTypeWise(driver).selectConcession();
    }

    @When("^select installment on student amount fee type wise$")
    public void select_installment_on_student_amount_fee_type_wise() throws Throwable {
        new StudentAmountFeeTypeWise(driver).selectInstallment();
    }

    @Then("^click show on student amount fee type wise$")
    public void click_show_on_student_amount_fee_type_wise() throws Throwable {
        new StudentAmountFeeTypeWise(driver).clickShow();
    }

//daily fee collection receipt range
    @When("^user open daily fee collection receipt range$")
    public void user_open_daily_fee_collection_receipt_range() throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).openDailyFeeCollectionReceiptRange();
    }

    @When("^select school with index \"([^\"]*)\" on daily fee collection receipt range$")
    public void select_school_with_index_on_daily_fee_collection_receipt_range(int arg1) throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on daily fee collection receipt range$")
    public void select_wing_with_index_on_daily_fee_collection_receipt_range(int arg1) throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectWing(arg1);
    }

    @When("^select class on daily fee collection receipt range$")
    public void select_class_on_daily_fee_collection_receipt_range() throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on daily fee collection receipt range$")
    public void select_board_with_index_on_daily_fee_collection_receipt_range(int arg1) throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectBoard(arg1);
    }

    @When("^select entry mode on daily fee collection receipt range$")
    public void select_entry_mode_on_daily_fee_collection_receipt_range() throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectEntryMode();
    }

    @When("^select pay mode on daily fee collection receipt range$")
    public void select_pay_mode_on_daily_fee_collection_receipt_range() throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectPayMode();
    }

    @When("^select fee type with index \"([^\"]*)\" on daily fee collection receipt range$")
    public void select_fee_type_with_index_on_daily_fee_collection_receipt_range(int arg1) throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectFeeType(arg1);
    }

    @When("^select head on daily fee collection receipt range$")
    public void select_head_on_daily_fee_collection_receipt_range() throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectHead();
    }

    @When("^enter value \"([^\"]*)\" in receipt from on daily fee collection receipt range$")
    public void enter_value_in_receipt_from_on_daily_fee_collection_receipt_range(String arg1) throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).enterReceiptFrom(arg1);
    }

    @When("^enter value \"([^\"]*)\" in receipt to on daily fee collection receipt range$")
    public void enter_value_in_receipt_to_on_daily_fee_collection_receipt_range(String arg1) throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).enterReceiptTo(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on daily fee collection receipt range$")
    public void select_user_with_index_on_daily_fee_collection_receipt_range(int arg1) throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).selectUser(arg1);
    }

    @Then("^click show on daily fee collection receipt range$")
    public void click_show_on_daily_fee_collection_receipt_range() throws Throwable {
        new DailyFeeCollectionReceiptRange(driver).clickShow();
    }

//pta daily fee collection date fee group wise
    @When("^user open pta daily fee collection date fee group wise$")
    public void user_open_pta_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).openPTADailyFeeCollectionDateFeeGroupWise();
    }

    @When("^select school with index \"([^\"]*)\" on pta daily fee collection date fee group wise$")
    public void select_school_with_index_on_pta_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on pta daily fee collection date fee group wise$")
    public void select_wing_with_index_on_pta_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectWing(arg1);
    }

    @When("^select class on pta daily fee collection date fee group wise$")
    public void select_class_on_pta_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on pta daily fee collection date fee group wise$")
    public void select_board_with_index_on_pta_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectBoard(arg1);
    }

    @When("^select entry mode on pta daily fee collection date fee group wise$")
    public void select_entry_mode_on_pta_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectEntryMode();
    }

    @When("^select pay mode on pta daily fee collection date fee group wise$")
    public void select_pay_mode_on_pta_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectPayMode();
    }

    @When("^select fee type with index \"([^\"]*)\" on pta daily fee collection date fee group wise$")
    public void select_fee_type_with_index_on_pta_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectFeeType(arg1);
    }

    @When("^select head on pta daily fee collection date fee group wise$")
    public void select_head_on_pta_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectHead();
    }

    @When("^select fee group on pta daily fee collection date fee group wise$")
    public void select_fee_group_on_pta_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectFeeGroup();
    }

    @When("^select user with index \"([^\"]*)\" on pta daily fee collection date fee group wise$")
    public void select_user_with_index_on_pta_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectUser(arg1);
    }

    @Then("^click show on pta daily fee collection date fee group wise$")
    public void click_show_on_pta_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).clickShow();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on pta daily fee collection date fee group wise$")
    public void select_from_date_as_month_year_and_day_on_pta_daily_fee_collection_date_fee_group_wise(String arg1, String arg2, String arg3) throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select radio button \"([^\"]*)\" on pta daily fee collection date fee group wise$")
    public void select_radio_button_on_pta_daily_fee_collection_date_fee_group_wise(String arg1) throws Throwable {
        new PTADailyFeeCollectionDateFeeGroupWise(driver).clickButton(arg1);
    }

//daily fee collection list with head fine filter
    @When("^user open daily fee collection list with head fine filter$")
    public void user_open_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).openDailyFeeCollectionListWithHeadFineFilter();
    }

    @When("^select school with index \"([^\"]*)\" on daily fee collection list with head fine filter$")
    public void select_school_with_index_on_daily_fee_collection_list_with_head_fine_filter(int arg1) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on daily fee collection list with head fine filter$")
    public void select_wing_with_index_on_daily_fee_collection_list_with_head_fine_filter(int arg1) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectWing(arg1);
    }

    @When("^select class on daily fee collection list with head fine filter$")
    public void select_class_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on daily fee collection list with head fine filter$")
    public void select_board_with_index_on_daily_fee_collection_list_with_head_fine_filter(int arg1) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectBoard(arg1);
    }

    @When("^select entry mode on daily fee collection list with head fine filter$")
    public void select_entry_mode_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectEntryMode();
    }

    @When("^select fee type on daily fee collection list with head fine filter$")
    public void select_fee_type_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectFeeType();
    }

    @When("^select installment on daily fee collection list with head fine filter$")
    public void select_installment_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectInstallment();
    }

    @When("^select pay mode on daily fee collection list with head fine filter$")
    public void select_pay_mode_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectPayMode();
    }

    @When("^select head on daily fee collection list with head fine filter$")
    public void select_head_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectHead();
    }

    @When("^select collection with index \"([^\"]*)\" on daily fee collection list with head fine filter$")
    public void select_collection_with_index_on_daily_fee_collection_list_with_head_fine_filter(int arg1) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectShowCollection(arg1);
    }

    @When("^select head fine on daily fee collection list with head fine filter$")
    public void select_head_fine_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectHeadFine();
    }

    @When("^select user with index \"([^\"]*)\" on daily fee collection list with head fine filter$")
    public void select_user_with_index_on_daily_fee_collection_list_with_head_fine_filter(int arg1) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectUser(arg1);
    }

    @When("^select status on daily fee collection list with head fine filter$")
    public void select_status_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectStatus();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection list with head fine filter$")
    public void select_from_date_as_month_year_and_day_on_daily_fee_collection_list_with_head_fine_filter(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^click receipt no range on daily fee collection list with head fine filter$")
    public void click_receipt_no_range_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).clickReceiptRange();
    }

    @When("^enter value \"([^\"]*)\" in receipt from on daily fee collection list with head fine filter$")
    public void enter_value_in_receipt_from_on_daily_fee_collection_list_with_head_fine_filter(String arg1) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).enterReceiptFrom(arg1);
    }

    @When("^enter value \"([^\"]*)\" in receipt to on daily fee collection list with head fine filter$")
    public void enter_value_in_receipt_to_on_daily_fee_collection_list_with_head_fine_filter(String arg1) throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).enterReceiptTo(arg1);
    }

    @When("^click settlement date on daily fee collection list with head fine filter$")
    public void click_settlement_date_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).clickSettlementDate();
    }

    @When("^click cheque clearance date on daily fee collection list with head fine filter$")
    public void click_cheque_clearance_date_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).clickChequeClearanceDate();
    }

    @Then("^click show on daily fee collection list with head fine filter$")
    public void click_show_on_daily_fee_collection_list_with_head_fine_filter() throws Throwable {
        new DailyFeeCollectionListWithHeadFineFilter(driver).clickShow();
    }

//fee collection student and class wise
    @When("^user open fee collection student and class wise$")
    public void user_open_fee_collection_student_and_class_wise() throws Throwable {
        new FeeCollectionStudentAndClassWise(driver).openFeeCollectionStudentAndClassWise();
    }

    @When("^select class with index \"([^\"]*)\" on fee collection student and class wise$")
    public void select_class_with_index_on_fee_collection_student_and_class_wise(int arg1) throws Throwable {
        new FeeCollectionStudentAndClassWise(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on fee collection student and class wise$")
    public void select_section_with_index_on_fee_collection_student_and_class_wise(int arg1) throws Throwable {
        new FeeCollectionStudentAndClassWise(driver).selectSection(arg1);
    }

    @When("^select fee head on fee collection student and class wise$")
    public void select_fee_head_on_fee_collection_student_and_class_wise() throws Throwable {
        new FeeCollectionStudentAndClassWise(driver).selectHead();
    }

    @When("^select order by with index \"([^\"]*)\" on fee collection student and class wise$")
    public void select_order_by_with_index_on_fee_collection_student_and_class_wise(int arg1) throws Throwable {
        new FeeCollectionStudentAndClassWise(driver).selectOrderBy(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on fee collection student and class wise$")
    public void select_user_with_index_on_fee_collection_student_and_class_wise(int arg1) throws Throwable {
        new FeeCollectionStudentAndClassWise(driver).selectUser(arg1);
    }

    @Then("^click show on fee collection student and class wise$")
    public void click_show_on_fee_collection_student_and_class_wise() throws Throwable {
        new FeeCollectionStudentAndClassWise(driver).clickShow();
    }

//fee defaulter list with head fine filter
    @Then("^user open fee defaulter list with head fine filter$")
    public void user_open_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).openFeeDefaulterListWithHeadFineFilter();
    }

    @Then("^select school with index \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_school_with_index_on_fee_defaulter_list_with_head_fine_filter(int arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" fee defaulter list with head fine filter$")
    public void select_wing_with_index_fee_defaulter_list_with_head_fine_filter(int arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectWing(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_class_with_index_on_fee_defaulter_list_with_head_fine_filter(int arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_section_with_index_on_fee_defaulter_list_with_head_fine_filter(int arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectSection(arg1);
    }

    @Then("^select board with index \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_board_with_index_on_fee_defaulter_list_with_head_fine_filter(int arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectBoard(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_fee_type_with_index_on_fee_defaulter_list_with_head_fine_filter(int arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectFeeType(arg1);
    }

    @Then("^select installment on fee defaulter list with head fine filter$")
    public void select_installment_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_till_date_as_month_year_and_day_on_fee_defaulter_list_with_head_fine_filter(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^select range with index \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_range_with_index_on_fee_defaulter_list_with_head_fine_filter(int arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectRange(arg1);
    }

    @Then("^enter range value \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void enter_range_value_on_fee_defaulter_list_with_head_fine_filter(String arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).enterRangeValue(arg1);
    }

    @Then("^select status on fee defaulter list with head fine filter$")
    public void select_status_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectStatus();
    }

    @Then("^click show on fee defaulter list with head fine filter$")
    public void click_show_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).clickShow();
    }

    @Then("^select radio button \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_radio_button_on_fee_defaulter_list_with_head_fine_filter(String arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).clickButton(arg1);
    }

    @Then("^select date range on fee defaulter list with head fine filter$")
    public void select_date_range_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter list with head fine filter$")
    public void select_from_date_as_month_year_and_day_on_fee_defaulter_list_with_head_fine_filter(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select radio button \"([^\"]*)\" head or headwise on fee defaulter list with head fine filter$")
    public void select_radio_button_head_or_headwise_on_fee_defaulter_list_with_head_fine_filter(String arg1) throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).clickButtonhead(arg1);
    }

    @Then("^click with fine on fee defaulter list with head fine filter$")
    public void click_with_fine_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).clickWithFine();
    }

    @Then("^click header with class group on fee defaulter list with head fine filter$")
    public void click_header_with_class_group_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).clickHeaderWithClassGroup();
    }

    @Then("^select select cheque clearance date on fee defaulter list with head fine filter$")
    public void select_select_cheque_clearance_date_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).clickChequeClearanceDate();
    }

    @Then("^select class on fee defaulter list with head fine filter$")
    public void select_class_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectClass();
    }

    @Then("^select head on fee defaulter list with head fine filter$")
    public void select_head_on_fee_defaulter_list_with_head_fine_filter() throws Throwable {
        new FeeDefaulterListWithHeadFineFilter(driver).selectHead();
    }

//defaulter list install head wise
    @Then("^user open defaulter list install head wise$")
    public void user_open_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).openDefaulterListInstallHeadWise();
    }

    @Then("^select school with index \"([^\"]*)\" on defaulter list install head wise$")
    public void select_school_with_index_on_defaulter_list_install_head_wise(int arg1) throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on defaulter list install head wise$")
    public void select_wing_with_index_on_defaulter_list_install_head_wise(int arg1) throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectWing(arg1);
    }

    @Then("^select class on defaulter list install head wise$")
    public void select_class_on_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on defaulter list install head wise$")
    public void select_board_with_index_on_defaulter_list_install_head_wise(int arg1) throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectBoard(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on defaulter list install head wise$")
    public void select_fee_type_with_index_on_defaulter_list_install_head_wise(int arg1) throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectFeeType(arg1);
    }

    @Then("^select installment on defaulter list install head wise$")
    public void select_installment_on_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on defaulter list install head wise$")
    public void select_till_date_as_month_year_and_day_on_defaulter_list_install_head_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^select fee head on defaulter list install head wise$")
    public void select_fee_head_on_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectHead();
    }

    @Then("^click show on defaulter list install head wise$")
    public void click_show_on_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).clickShow();
    }

    @Then("^click date range on defaulter list install head wise$")
    public void click_date_range_on_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on defaulter list install head wise$")
    public void select_from_date_as_month_year_and_day_on_defaulter_list_install_head_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DefaulterListInstallHeadWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click with fine on defaulter list install head wise$")
    public void click_with_fine_on_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).clickWithFine();
    }

    @Then("^click check clearing date on defaulter list install head wise$")
    public void click_check_clearing_date_on_defaulter_list_install_head_wise() throws Throwable {
        new DefaulterListInstallHeadWise(driver).clickChequeClearanceDate();
    }

//fee defaulter list boarding wise
    @Then("^user open fee defaulter list boarding wise$")
    public void user_open_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).openFeeDefaulterListBoardingWise();
    }

    @Then("^select school with index \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_school_with_index_on_fee_defaulter_list_boarding_wise(int arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" fee defaulter list boarding wise$")
    public void select_wing_with_index_fee_defaulter_list_boarding_wise(int arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectWing(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_class_with_index_on_fee_defaulter_list_boarding_wise(int arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_section_with_index_on_fee_defaulter_list_boarding_wise(int arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectSection(arg1);
    }

    @Then("^select board with index \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_board_with_index_on_fee_defaulter_list_boarding_wise(int arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectBoard(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_fee_type_with_index_on_fee_defaulter_list_boarding_wise(int arg1) throws Throwable {
         new FeeDefaulterListBoardingWise(driver).selectFeeType(arg1);
    }

    @Then("^select installment on fee defaulter list boarding wise$")
    public void select_installment_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_till_date_as_month_year_and_day_on_fee_defaulter_list_boarding_wise(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^select range with index \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_range_with_index_on_fee_defaulter_list_boarding_wise(int arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectRange(arg1);
    }

    @Then("^enter range value \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void enter_range_value_on_fee_defaulter_list_boarding_wise(String arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).enterRangeValue(arg1);
    }

    @And("^select boarding with index \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void selectBoardingWithIndexOnFeeDefaulterListBoardingWise(int arg0) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectBoarding(arg0);
    }

    @Then("^click show on fee defaulter list boarding wise$")
    public void click_show_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).clickShow();
    }

    @Then("^select radio button \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_radio_button_on_fee_defaulter_list_boarding_wise(String arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).clickButton(arg1);
    }

    @Then("^select date range on fee defaulter list boarding wise$")
    public void select_date_range_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter list boarding wise$")
    public void select_from_date_as_month_year_and_day_on_fee_defaulter_list_boarding_wise(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select radio button \"([^\"]*)\" head or headwise on fee defaulter list boarding wise$")
    public void select_radio_button_head_or_headwise_on_fee_defaulter_list_boarding_wise(String arg1) throws Throwable {
        new FeeDefaulterListBoardingWise(driver).clickButtonhead(arg1);
    }

    @Then("^click with fine on fee defaulter list boarding wise$")
    public void click_with_fine_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).clickWithFine();
    }

    @Then("^click header with class group on fee defaulter list boarding wise$")
    public void click_header_with_class_group_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).clickHeaderWithClassGroup();
    }

    @Then("^select select cheque clearance date on fee defaulter list boarding wise$")
    public void select_select_cheque_clearance_date_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).clickChequeClearanceDate();
    }

    @Then("^select class on fee defaulter list boarding wise$")
    public void select_class_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectClass();
    }

    @Then("^select head on fee defaulter list boarding wise$")
    public void select_head_on_fee_defaulter_list_boarding_wise() throws Throwable {
        new FeeDefaulterListBoardingWise(driver).selectHead();
    }

//total concession report install head wise
    @When("^user open total concession report install head wise$")
    public void user_open_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).openTotalConcessionReportInstallHeadWise();
    }

    @When("^select school with index \"([^\"]*)\" on total concession report install head wise$")
    public void select_school_with_index_on_total_concession_report_install_head_wise(int arg1) throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on total concession report install head wise$")
    public void select_wing_with_index_on_total_concession_report_install_head_wise(int arg1) throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectWing(arg1);
    }

    @When("^select class on total concession report install head wise$")
    public void select_class_on_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on total concession report install head wise$")
    public void select_board_with_index_on_total_concession_report_install_head_wise(int arg1) throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectBoard(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on total concession report install head wise$")
    public void select_fee_type_with_index_on_total_concession_report_install_head_wise(int arg1) throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectFeeType(arg1);
    }

    @When("^select installment on total concession report install head wise$")
    public void select_installment_on_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectInstallment();
    }

    @When("^select concession on total concession report install head wise$")
    public void select_concession_on_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectConcession();
    }

    @When("^select head on total concession report install head wise$")
    public void select_head_on_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectHead();
    }

    @When("^select student status with index \"([^\"]*)\" on total concession report install head wise$")
    public void select_student_status_with_index_on_total_concession_report_install_head_wise(int arg1) throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).selectStudentStatus(arg1);
    }

    @When("^click head wise on total concession report install head wise$")
    public void click_head_wise_on_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).clickHeadWise();
    }

    @When("^click entry time on total concession report install head wise$")
    public void click_entry_time_on_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).clickEntryTime();
    }

    @When("^select radio button \"([^\"]*)\" on total concession report install head wise$")
    public void select_radio_button_on_total_concession_report_install_head_wise(String arg1) throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).clickButton(arg1);
    }

    @When("^click show on total concession report install head wise$")
    public void click_show_on_total_concession_report_install_head_wise() throws Throwable {
        new TotalConcessionReportInstallHeadWise(driver).clickShow();
    }

//student ledger class wise
    @When("^user open student ledger class wise$")
    public void user_open_student_ledger_class_wise() throws Throwable {
        new StudentLedgerClassWise(driver).openStudentLedgerClassWise();
    }

    @When("^select school with index \"([^\"]*)\" on student ledger class wise$")
    public void select_school_with_index_on_student_ledger_class_wise(int arg1) throws Throwable {
        new StudentLedgerClassWise(driver).selectSchool(arg1);
    }

    @When("^select class on student ledger class wise$")
    public void select_class_on_student_ledger_class_wise() throws Throwable {
        new StudentLedgerClassWise(driver).selectClass();
    }

    @When("^select fee type with index \"([^\"]*)\" on student ledger class wise$")
    public void select_fee_type_with_index_on_student_ledger_class_wise(int arg1) throws Throwable {
        new StudentLedgerClassWise(driver).selectFeeType(arg1);
    }

    @When("^select installment on student ledger class wise$")
    public void select_installment_on_student_ledger_class_wise() throws Throwable {
        new StudentLedgerClassWise(driver).selectInstallment();
    }

    @When("^select head on student ledger class wise$")
    public void select_head_on_student_ledger_class_wise() throws Throwable {
        new StudentLedgerClassWise(driver).selectHead();
    }

    @When("^select student status with index \"([^\"]*)\" on student ledger class wise$")
    public void select_student_status_with_index_on_student_ledger_class_wise(int arg1) throws Throwable {
        new StudentLedgerClassWise(driver).selectStudentStatus(arg1);
    }

    @Then("^click show on student ledger class wise$")
    public void click_show_on_student_ledger_class_wise() throws Throwable {
        new StudentLedgerClassWise(driver).clickShow();
    }

    @When("^click only full year paid fees on student ledger class wise$")
    public void click_only_full_year_paid_fees_on_student_ledger_class_wise() throws Throwable {
        new StudentLedgerClassWise(driver).clickFullYearPaidFees();
    }

    @When("^click with fine on student ledger class wise$")
    public void click_with_fine_on_student_ledger_class_wise() throws Throwable {
        new StudentLedgerClassWise(driver).clickWithFine();
    }

    @When("^select radio button \"([^\"]*)\" on student ledger class wise$")
    public void select_radio_button_on_student_ledger_class_wise(String arg1) throws Throwable {
        new StudentLedgerClassWise(driver).clickButton(arg1);
    }

    @And("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on student ledger class wise$")
    public void selectTillDateAsMonthYearAndDayOnStudentLedgerClassWise(String arg0, String arg1, String arg2) throws Throwable {
        new StudentLedgerClassWise(driver).selectToDate(arg0, arg1, arg2);
    }

//student ledger class wise with rec date
    @When("^user open student ledger class wise with rec date$")
    public void user_open_student_ledger_class_wise_with_rec_date() throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).openStudentLedgerClassWiseWithRecDate();
    }

    @When("^select school with index \"([^\"]*)\" on student ledger class wise with rec date$")
    public void select_school_with_index_on_student_ledger_class_wise_with_rec_date(int arg1) throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).selectSchool(arg1);
    }

    @When("^select class on student ledger class wise with rec date$")
    public void select_class_on_student_ledger_class_wise_with_rec_date() throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).selectClass();
    }

    @When("^select fee type with index \"([^\"]*)\" on student ledger class wise with rec date$")
    public void select_fee_type_with_index_on_student_ledger_class_wise_with_rec_date(int arg1) throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).selectFeeType(arg1);
    }

    @When("^select installment on student ledger class wise with rec date$")
    public void select_installment_on_student_ledger_class_wise_with_rec_date() throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).selectInstallment();
    }

    @When("^select head on student ledger class wise with rec date$")
    public void select_head_on_student_ledger_class_wise_with_rec_date() throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).selectHead();
    }

    @When("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on student ledger class wise with rec date$")
    public void select_till_date_as_month_year_and_day_on_student_ledger_class_wise_with_rec_date(String arg1, String arg2, String arg3) throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^click show on student ledger class wise with rec date$")
    public void click_show_on_student_ledger_class_wise_with_rec_date() throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).clickShow();
    }

    @When("^click only full year paid fees on student ledger class wise with rec date$")
    public void click_only_full_year_paid_fees_on_student_ledger_class_wise_with_rec_date() throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).clickFullYearPaidFees();
    }

    @When("^click with fine on student ledger class wise with rec date$")
    public void click_with_fine_on_student_ledger_class_wise_with_rec_date() throws Throwable {
        new StudentLedgerClassWiseWithRecDate(driver).clickWithFine();
    }

//annual student ledger1
    @When("^user open annual student ledger one$")
    public void user_open_annual_student_ledger_one() throws Throwable {
        new AnnualStudentLedger1(driver).openAnnualStudentLedger1();
    }

    @When("^select class with index \"([^\"]*)\" on annual student ledger one$")
    public void select_class_with_index_on_annual_student_ledger_one(int arg1) throws Throwable {
        new AnnualStudentLedger1(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on annual student ledger one$")
    public void select_section_with_index_on_annual_student_ledger_one(int arg1) throws Throwable {
        new AnnualStudentLedger1(driver).selectSection(arg1);
    }

    @When("^search student on annual student ledger one$")
    public void search_student_on_annual_student_ledger_one() throws Throwable {
        new AnnualStudentLedger1(driver).searchStudent();
    }

    @When("^select fee type with index \"([^\"]*)\" on annual student ledger one$")
    public void select_fee_type_with_index_on_annual_student_ledger_one(int arg1) throws Throwable {
        new AnnualStudentLedger1(driver).selectFeeType(arg1);
    }

    @Then("^click show on annual student ledger one$")
    public void click_show_on_annual_student_ledger_one() throws Throwable {
        new AnnualStudentLedger1(driver).clickShow();
    }

//annual student ledger2
    @When("^user open annual student ledger two$")
    public void user_open_annual_student_ledger_two() throws Throwable {
        new AnnualStudentLedger2(driver).openAnnualStudentLedger2();
    }

    @When("^select class with index \"([^\"]*)\" on annual student ledger two$")
    public void select_class_with_index_on_annual_student_ledger_two(int arg1) throws Throwable {
        new AnnualStudentLedger2(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on annual student ledger two$")
    public void select_section_with_index_on_annual_student_ledger_two(int arg1) throws Throwable {
        new AnnualStudentLedger2(driver).selectSection(arg1);
    }

    @When("^search student on annual student ledger two$")
    public void search_student_on_annual_student_ledger_two() throws Throwable {
        new AnnualStudentLedger2(driver).searchStudent();
    }

    @When("^select fee type with index \"([^\"]*)\" on annual student ledger two$")
    public void select_fee_type_with_index_on_annual_student_ledger_two(int arg1) throws Throwable {
        new AnnualStudentLedger2(driver).selectFeeType(arg1);
    }

    @Then("^click show on annual student ledger two$")
    public void click_show_on_annual_student_ledger_two() throws Throwable {
        new AnnualStudentLedger2(driver).clickShow();
    }

    @When("^user open fees student ledger$")
    public void user_open_fees_student_ledger() throws Throwable {
        new FeesStudentLedger(driver).openFeesStudentLedger();
    }

    @When("^select class with index \"([^\"]*)\" on fees student ledger$")
    public void select_class_with_index_on_fees_student_ledger(int arg1) throws Throwable {
        new FeesStudentLedger(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on fees student ledger$")
    public void select_section_with_index_on_fees_student_ledger(int arg1) throws Throwable {
        new FeesStudentLedger(driver).selectSection(arg1);
    }

    @When("^search student on fees student ledger$")
    public void search_student_on_fees_student_ledger() throws Throwable {
        new FeesStudentLedger(driver).searchStudent();
    }

    @When("^select fee type with index \"([^\"]*)\" on fees student ledger$")
    public void select_fee_type_with_index_on_fees_student_ledger(int arg1) throws Throwable {
        new FeesStudentLedger(driver).selectFeeType(arg1);
    }

    @Then("^click show on fees student ledger$")
    public void click_show_on_fees_student_ledger() throws Throwable {
        new FeesStudentLedger(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on fees student ledger$")
    public void select_radio_button_on_fees_student_ledger(String arg1) throws Throwable {
        new FeesStudentLedger(driver).clickButton(arg1);
    }

//uploaded excel details
    @When("^user open uploaded excel details$")
    public void user_open_uploaded_excel_details() throws Throwable {
        new UploadedExcelDetails(driver).openUploadedExcelDetails();
    }

    @When("^select school with index \"([^\"]*)\" on uploaded excel details$")
    public void select_school_with_index_on_uploaded_excel_details(int arg1) throws Throwable {
        new UploadedExcelDetails(driver).selectSchool(arg1);
    }

    @When("^select radio button \"([^\"]*)\" on uploaded excel details$")
    public void select_radio_button_on_uploaded_excel_details(String arg1) throws Throwable {
        new UploadedExcelDetails(driver).clickButton(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on uploaded excel details$")
    public void select_class_with_index_on_uploaded_excel_details(int arg1) throws Throwable {
        new UploadedExcelDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on uploaded excel details$")
    public void select_section_with_index_on_uploaded_excel_details(int arg1) throws Throwable {
        new UploadedExcelDetails(driver).selectSection(arg1);
    }

    @When("^select fee status with index \"([^\"]*)\" on uploaded excel details$")
    public void select_fee_status_with_index_on_uploaded_excel_details(int arg1) throws Throwable {
        new UploadedExcelDetails(driver).selectFeeStatus(arg1);
    }

    @When("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on uploaded excel details$")
    public void select_till_date_as_month_year_and_day_on_uploaded_excel_details(String arg1, String arg2, String arg3) throws Throwable {
        new UploadedExcelDetails(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^select excel name with index \"([^\"]*)\" on uploaded excel details$")
    public void select_excel_name_with_index_on_uploaded_excel_details(int arg1) throws Throwable {
        new UploadedExcelDetails(driver).selectExcelName(arg1);
    }

    @Then("^click show on uploaded excel details$")
    public void click_show_on_uploaded_excel_details() throws Throwable {
        new UploadedExcelDetails(driver).clickShow();
    }

//student wise receipt report
    @When("^user open student wise receipt report$")
    public void user_open_student_wise_receipt_report() throws Throwable {
        new StudentWiseReceiptReport(driver).openStudentWiseReceiptReport();
    }

    @When("^select class with index \"([^\"]*)\" on student wise receipt report$")
    public void select_class_with_index_on_student_wise_receipt_report(int arg1) throws Throwable {
        new StudentWiseReceiptReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on student wise receipt report$")
    public void select_section_with_index_on_student_wise_receipt_report(int arg1) throws Throwable {
        new StudentWiseReceiptReport(driver).selectSection(arg1);
    }

    @When("^search student on student wise receipt report$")
    public void search_student_on_student_wise_receipt_report() throws Throwable {
        new StudentWiseReceiptReport(driver).searchStudent();
    }

    @When("^select fee type with index \"([^\"]*)\" on student wise receipt report$")
    public void select_fee_type_with_index_on_student_wise_receipt_report(int arg1) throws Throwable {
        new StudentWiseReceiptReport(driver).selectFeeType(arg1);
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on student wise receipt report$")
    public void select_from_date_as_month_year_and_day_on_student_wise_receipt_report(String arg1, String arg2, String arg3) throws Throwable {
        new StudentWiseReceiptReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on student wise receipt report$")
    public void click_show_on_student_wise_receipt_report() throws Throwable {
        new StudentWiseReceiptReport(driver).clickShow();
    }

//category wise student report
    @When("^user open category wise student report$")
    public void user_open_category_wise_student_report() throws Throwable {
        new CategoryWiseStudentReport(driver).openCategoryWiseStudentReport();
    }

    @When("^select category with index \"([^\"]*)\" on category wise student report$")
    public void select_category_with_index_on_category_wise_student_report(int arg1) throws Throwable {
        new CategoryWiseStudentReport(driver).selectCategory(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on category wise student report$")
    public void select_class_with_index_on_category_wise_student_report(int arg1) throws Throwable {
        new CategoryWiseStudentReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on category wise student report$")
    public void select_section_with_index_on_category_wise_student_report(int arg1) throws Throwable {
        new CategoryWiseStudentReport(driver).selectSection(arg1);
    }

    @When("^select father profession with index \"([^\"]*)\" on category wise student report$")
    public void select_father_profession_with_index_on_category_wise_student_report(int arg1) throws Throwable {
        new CategoryWiseStudentReport(driver).selectProfession(arg1);
    }

    @Then("^click show on category wise student report$")
    public void click_show_on_category_wise_student_report() throws Throwable {
        new CategoryWiseStudentReport(driver).clickShow();
    }

    @When("^user open gender religion wise student report$")
    public void user_open_gender_religion_wise_student_report() throws Throwable {
        new GenderReligionWiseStudentReport(driver).openGenderReligionWiseStudentReport();
    }

    @When("^select religion with index \"([^\"]*)\" on gender religion wise student report$")
    public void select_religion_with_index_on_gender_religion_wise_student_report(int arg1) throws Throwable {
        new GenderReligionWiseStudentReport(driver).selectReligion(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on gender religion wise student report$")
    public void select_class_with_index_on_gender_religion_wise_student_report(int arg1) throws Throwable {
        new GenderReligionWiseStudentReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on gender religion wise student report$")
    public void select_section_with_index_on_gender_religion_wise_student_report(int arg1) throws Throwable {
        new GenderReligionWiseStudentReport(driver).selectSection(arg1);
    }

    @When("^select gender with index \"([^\"]*)\" on gender religion wise student report$")
    public void select_gender_with_index_on_gender_religion_wise_student_report(int arg1) throws Throwable {
        new GenderReligionWiseStudentReport(driver).selectGender(arg1);
    }

    @Then("^click show on gender religion wise student report$")
    public void click_show_on_gender_religion_wise_student_report() throws Throwable {
        new GenderReligionWiseStudentReport(driver).clickShow();
    }

//surname wise student details
    @When("^user open surname wise student details$")
    public void user_open_surname_wise_student_details() throws Throwable {
        new SurnameWiseStudentDetails(driver).openSurnameWiseStudentDetails();
    }

    @When("^select class with index \"([^\"]*)\" on surname wise student details$")
    public void select_class_with_index_on_surname_wise_student_details(int arg1) throws Throwable {
        new SurnameWiseStudentDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on surname wise student details$")
    public void select_section_with_index_on_surname_wise_student_details(int arg1) throws Throwable {
        new SurnameWiseStudentDetails(driver).selectSection(arg1);
    }

    @When("^select student details on surname wise student details$")
    public void select_student_details_on_surname_wise_student_details() throws Throwable {
        new SurnameWiseStudentDetails(driver).selectStudentDetails();
    }

    @Then("^click show on surname wise student details$")
    public void click_show_on_surname_wise_student_details() throws Throwable {
        new SurnameWiseStudentDetails(driver).clickShow();
    }

//date wise admission report
    @When("^user open date wise admission report$")
    public void user_open_date_wise_admission_report() throws Throwable {
        new DateWiseAdmissionReport(driver).openDateWiseAdmissionReport();
    }

    @When("^select class with index \"([^\"]*)\" on date wise admission report$")
    public void select_class_with_index_on_date_wise_admission_report(int arg1) throws Throwable {
        new DateWiseAdmissionReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on date wise admission report$")
    public void select_section_with_index_on_date_wise_admission_report(int arg1) throws Throwable {
        new DateWiseAdmissionReport(driver).selectSection(arg1);
    }

    @When("^select other details on date wise admission report$")
    public void select_other_details_on_date_wise_admission_report() throws Throwable {
        new DateWiseAdmissionReport(driver).selectOtherDetails();
    }

    @Then("^click show on date wise admission report$")
    public void click_show_on_date_wise_admission_report() throws Throwable {
        new DateWiseAdmissionReport(driver).clickShow();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on date wise admission report$")
    public void selectFromDateAsMonthYearAndDayOnDateWiseAdmissionReport(String arg0, String arg1, String arg2) throws Throwable {
        new DateWiseAdmissionReport(driver).selectFromDate(arg0, arg1, arg2);
    }

//student house wise report
    @When("^user open student house wise report$")
    public void user_open_student_house_wise_report() throws Throwable {
        new StudentHouseWiseReport(driver).openStudentHouseWiseReport();
    }

    @When("^select class with index \"([^\"]*)\" on student house wise report$")
    public void select_class_with_index_on_student_house_wise_report(int arg1) throws Throwable {
        new StudentHouseWiseReport(driver).selectClass(arg1);
    }

    @When("^click for section wise on student house wise report$")
    public void click_for_section_wise_on_student_house_wise_report() throws Throwable {
        new StudentHouseWiseReport(driver).clickSectionWise();
    }

    @When("^select section with index \"([^\"]*)\" on student house wise report$")
    public void select_section_with_index_on_student_house_wise_report(int arg1) throws Throwable {
        new StudentHouseWiseReport(driver).selectSection(arg1);
    }

    @When("^select house with index \"([^\"]*)\" on student house wise report$")
    public void select_house_with_index_on_student_house_wise_report(int arg1) throws Throwable {
        new StudentHouseWiseReport(driver).selectHouse(arg1);
    }

    @When("^select range type with index \"([^\"]*)\" on student house wise report$")
    public void select_range_type_with_index_on_student_house_wise_report(int arg1) throws Throwable {
        new StudentHouseWiseReport(driver).selectRange(arg1);
    }

    @When("^select from age with index \"([^\"]*)\" on student house wise report$")
    public void select_from_age_with_index_on_student_house_wise_report(int arg1) throws Throwable {
        new StudentHouseWiseReport(driver).selectFromAge(arg1);
    }

    @Then("^click show on student house wise report$")
    public void click_show_on_student_house_wise_report() throws Throwable {
        new StudentHouseWiseReport(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on student house wise report$")
    public void select_radio_button_on_student_house_wise_report(String arg1) throws Throwable {
        new StudentHouseWiseReport(driver).clickButton(arg1);
    }

//print transport id card
    @When("^user open print transport id card$")
    public void user_open_print_transport_id_card() throws Throwable {
        new PrintTransportIDCard(driver).openPrintTransportIDCard();
    }

    @When("^select school with index \"([^\"]*)\" on print transport id card$")
    public void select_school_with_index_on_print_transport_id_card(int arg1) throws Throwable {
        new PrintTransportIDCard(driver).selectSchool(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on print transport id card$")
    public void select_class_with_index_on_print_transport_id_card(int arg1) throws Throwable {
        new PrintTransportIDCard(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on print transport id card$")
    public void select_section_with_index_on_print_transport_id_card(int arg1) throws Throwable {
        new PrintTransportIDCard(driver).selectSection(arg1);
    }

    @When("^search student on print transport id card$")
    public void search_student_on_print_transport_id_card() throws Throwable {
        new PrintTransportIDCard(driver).searchStudent();
    }

    @Then("^click show on print transport id card$")
    public void click_show_on_print_transport_id_card() throws Throwable {
        new PrintTransportIDCard(driver).clickShow();
    }

//estimated transport details
    @When("^user open estimated transport details$")
    public void user_open_estimated_transport_details() throws Throwable {
        new EstimatedTransportDetails(driver).openEstimatedTransportDetails();
    }

    @When("^select school with index \"([^\"]*)\" on estimated transport details$")
    public void select_school_with_index_on_estimated_transport_details(int arg1) throws Throwable {
        new EstimatedTransportDetails(driver).selectSchool(arg1);
    }

    @When("^select route with index \"([^\"]*)\" on estimated transport details$")
    public void select_route_with_index_on_estimated_transport_details(int arg1) throws Throwable {
        new EstimatedTransportDetails(driver).selectRoute(arg1);
    }

    @When("^select vehicle with index \"([^\"]*)\" on estimated transport details$")
    public void select_vehicle_with_index_on_estimated_transport_details(int arg1) throws Throwable {
        new EstimatedTransportDetails(driver).selectVehicle(arg1);
    }

    @When("^select class on estimated transport details$")
    public void select_class_on_estimated_transport_details() throws Throwable {
        new EstimatedTransportDetails(driver).selectClass();
    }

    @When("^select installment on estimated transport details$")
    public void select_installment_on_estimated_transport_details() throws Throwable {
        new EstimatedTransportDetails(driver).selectInstallment();
    }

    @Then("^click show on estimated transport details$")
    public void click_show_on_estimated_transport_details() throws Throwable {
        new EstimatedTransportDetails(driver).clickShow();
    }

//self transport report
    @When("^user open self transport report$")
    public void user_open_self_transport_report() throws Throwable {
        new SelfTransportReport(driver).openSelfTransportReport();
    }

    @When("^select transport with index \"([^\"]*)\" on self transport report$")
    public void select_transport_with_index_on_self_transport_report(int arg1) throws Throwable {
        new SelfTransportReport(driver).selectTransport(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on self transport report$")
    public void select_class_with_index_on_self_transport_report(int arg1) throws Throwable {
        new SelfTransportReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on self transport report$")
    public void select_section_with_index_on_self_transport_report(int arg1) throws Throwable {
        new SelfTransportReport(driver).selectSection(arg1);
    }

    @When("^select additional field on self transport report$")
    public void select_additional_field_on_self_transport_report() throws Throwable {
        new SelfTransportReport(driver).selectAdditionalField();
    }

    @Then("^click show on self transport report$")
    public void click_show_on_self_transport_report() throws Throwable {
        new SelfTransportReport(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on self transport report$")
    public void select_radio_button_on_self_transport_report(String arg1) throws Throwable {
        new SelfTransportReport(driver).clickButton(arg1);
    }

//assigned transport report
    @When("^user open assigned transport report$")
    public void user_open_assigned_transport_report() throws Throwable {
        new AssignedTransportReport(driver).openAssignedTransportReport();
    }

    @When("^select class with index \"([^\"]*)\" on assigned transport report$")
    public void select_class_with_index_on_assigned_transport_report(int arg1) throws Throwable {
        new AssignedTransportReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on assigned transport report$")
    public void select_section_with_index_on_assigned_transport_report(int arg1) throws Throwable {
        new AssignedTransportReport(driver).selectSection(arg1);
    }

    @When("^select month on assigned transport report$")
    public void select_month_on_assigned_transport_report() throws Throwable {
        new AssignedTransportReport(driver).selectMonth();
    }

    @When("^enter search student on assigned transport report$")
    public void enter_search_student_on_assigned_transport_report() throws Throwable {
        new AssignedTransportReport(driver).searchStudent();
    }

    @When("^select user with index \"([^\"]*)\" on assigned transport report$")
    public void select_user_with_index_on_assigned_transport_report(int arg1) throws Throwable {
        new AssignedTransportReport(driver).selectUser(arg1);
    }

    @Then("^click show on assigned transport report$")
    public void click_show_on_assigned_transport_report() throws Throwable {
        new AssignedTransportReport(driver).clickShow();
    }

//paid transport
    @When("^user open paid transport$")
    public void user_open_paid_transport() throws Throwable {
        new PaidTransport(driver).openPaidTransport();
    }

    @When("^select school with index \"([^\"]*)\" on paid transport$")
    public void select_school_with_index_on_paid_transport(int arg1) throws Throwable {
        new PaidTransport(driver).selectSchool(arg1);
    }

    @When("^select class on paid transport$")
    public void select_class_on_paid_transport() throws Throwable {
        new PaidTransport(driver).selectClass();
    }

    @When("^select route with index \"([^\"]*)\" on paid transport$")
    public void select_route_with_index_on_paid_transport(int arg1) throws Throwable {
        new PaidTransport(driver).selectRoute(arg1);
    }

    @When("^select vehicle with index \"([^\"]*)\" on paid transport$")
    public void select_vehicle_with_index_on_paid_transport(int arg1) throws Throwable {
        new PaidTransport(driver).selectVehicle(arg1);
    }

    @When("^select pay mode on paid transport$")
    public void select_pay_mode_on_paid_transport() throws Throwable {
        new PaidTransport(driver).selectPayMode();
    }

    @When("^select installment on paid transport$")
    public void select_installment_on_paid_transport() throws Throwable {
        new PaidTransport(driver).selectInstallment();
    }

    @When("^select user with index \"([^\"]*)\" on paid transport$")
    public void select_user_with_index_on_paid_transport(int arg1) throws Throwable {
        new PaidTransport(driver).selectUser(arg1);
    }

    @Then("^click show on paid transport$")
    public void click_show_on_paid_transport() throws Throwable {
        new PaidTransport(driver).clickShow();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on paid transport$")
    public void select_from_date_as_month_year_and_day_on_paid_transport(String arg1, String arg2, String arg3) throws Throwable {
        new PaidTransport(driver).selectFromDate(arg1, arg2, arg3);
    }

//student strength consolidated
    @When("^user open student strength consolidated$")
    public void user_open_student_strength_consolidated() throws Throwable {
        new StudentStrengthConsolidated(driver).openStudentStrengthConsolidated();
    }

    @When("^select class with index \"([^\"]*)\" on student strength consolidated$")
    public void select_class_with_index_on_student_strength_consolidated(int arg1) throws Throwable {
        new StudentStrengthConsolidated(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on student strength consolidated$")
    public void select_section_with_index_on_student_strength_consolidated(int arg1) throws Throwable {
        new StudentStrengthConsolidated(driver).selectSection(arg1);
    }

    @Then("^click show on student strength consolidated$")
    public void click_show_on_student_strength_consolidated() throws Throwable {
        new StudentStrengthConsolidated(driver).clickShow();
    }

//student strength ratio wise report
    @When("^user open student strength ratio wise report$")
    public void user_open_student_strength_ratio_wise_report() throws Throwable {
        new StudentStrengthRatioWiseReport(driver).openStudentStrengthRatioWiseReport();
    }

    @When("^select class with index \"([^\"]*)\" on student strength ratio wise report$")
    public void select_class_with_index_on_student_strength_ratio_wise_report(int arg1) throws Throwable {
        new StudentStrengthRatioWiseReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on student strength ratio wise report$")
    public void select_section_with_index_on_student_strength_ratio_wise_report(int arg1) throws Throwable {
        new StudentStrengthRatioWiseReport(driver).selectSection(arg1);
    }

    @Then("^click show on student strength ratio wise report$")
    public void click_show_on_student_strength_ratio_wise_report() throws Throwable {
        new StudentStrengthRatioWiseReport(driver).clickShow();
    }

    @When("^click new old student status on student strength ratio wise report$")
    public void click_new_old_student_status_on_student_strength_ratio_wise_report() throws Throwable {
        new StudentStrengthRatioWiseReport(driver).clickNewOldStudentStatus();
    }

//ews class wise strength report
    @When("^user open ews class wise strength report$")
    public void user_open_ews_class_wise_strength_report() throws Throwable {
        new EwsClassWiseStrengthReport(driver).openEwsClassWiseStrengthReport();
    }

    @When("^select class with index \"([^\"]*)\" on ews class wise strength report$")
    public void select_class_with_index_on_ews_class_wise_strength_report(int arg1) throws Throwable {
        new EwsClassWiseStrengthReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on ews class wise strength report$")
    public void select_section_with_index_on_ews_class_wise_strength_report(int arg1) throws Throwable {
        new EwsClassWiseStrengthReport(driver).selectSection(arg1);
    }

    @Then("^click show on ews class wise strength report$")
    public void click_show_on_ews_class_wise_strength_report() throws Throwable {
        new EwsClassWiseStrengthReport(driver).clickShow();
    }

//category gender religion wise student strength
    @When("^user open category gender religion wise student strength$")
    public void user_open_category_gender_religion_wise_student_strength() throws Throwable {
        new CategoryGenderReligionWiseStudentStrength(driver).openCategoryGenderReligionWiseStudentStrength();
    }

    @When("^select class with index \"([^\"]*)\" on category gender religion wise student strength$")
    public void select_class_with_index_on_category_gender_religion_wise_student_strength(int arg1) throws Throwable {
        new CategoryGenderReligionWiseStudentStrength(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on category gender religion wise student strength$")
    public void select_section_with_index_on_category_gender_religion_wise_student_strength(int arg1) throws Throwable {
        new CategoryGenderReligionWiseStudentStrength(driver).selectSection(arg1);
    }

    @Then("^click show on category gender religion wise student strength$")
    public void click_show_on_category_gender_religion_wise_student_strength() throws Throwable {
        new CategoryGenderReligionWiseStudentStrength(driver).clickShow();
    }

//transport student strength report
    @When("^user open transport student strength report$")
    public void user_open_transport_student_strength_report() throws Throwable {
        new TransportStudentStrengthReport(driver).openTransportStudentStrengthReport();
    }

    @When("^select class with index \"([^\"]*)\" on transport student strength report$")
    public void select_class_with_index_on_transport_student_strength_report(int arg1) throws Throwable {
        new TransportStudentStrengthReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on transport student strength report$")
    public void select_section_with_index_on_transport_student_strength_report(int arg1) throws Throwable {
        new TransportStudentStrengthReport(driver).selectSection(arg1);
    }

    @When("^select route with index \"([^\"]*)\" on transport student strength report$")
    public void select_route_with_index_on_transport_student_strength_report(int arg1) throws Throwable {
        new TransportStudentStrengthReport(driver).selectRoute(arg1);
    }

    @Then("^click show on transport student strength report$")
    public void click_show_on_transport_student_strength_report() throws Throwable {
        new TransportStudentStrengthReport(driver).clickShow();
    }

//religion gender wise student strength
    @When("^user open religion gender wise student strength$")
    public void user_open_religion_gender_wise_student_strength() throws Throwable {
        new ReligionGenderWiseStudentStrength(driver).openReligionGenderWiseStudentStrength();
    }

    @When("^select class with index \"([^\"]*)\" on religion gender wise student strength$")
    public void select_class_with_index_on_religion_gender_wise_student_strength(int arg1) throws Throwable {
        new ReligionGenderWiseStudentStrength(driver).selectClass(arg1);
    }

    @When("^click for section wise on religion gender wise student strength$")
    public void click_for_section_wise_on_religion_gender_wise_student_strength() throws Throwable {
        new ReligionGenderWiseStudentStrength(driver).clickSectionWise();
    }

    @When("^select section with index \"([^\"]*)\" on religion gender wise student strength$")
    public void select_section_with_index_on_religion_gender_wise_student_strength(int arg1) throws Throwable {
        new ReligionGenderWiseStudentStrength(driver).selectSection(arg1);
    }

    @When("^select radio button \"([^\"]*)\" on religion gender wise student strength$")
    public void select_radio_button_on_religion_gender_wise_student_strength(String arg1) throws Throwable {
        new ReligionGenderWiseStudentStrength(driver).clickButton(arg1);
    }

    @Then("^click show on religion gender wise student strength$")
    public void click_show_on_religion_gender_wise_student_strength() throws Throwable {
        new ReligionGenderWiseStudentStrength(driver).clickShow();
    }

//class wise student strength
    @When("^user open class wise student strength$")
    public void user_open_class_wise_student_strength() throws Throwable {
        new ClassWiseStudentStrength(driver).openClassWiseStudentStrength();
    }

    @When("^select radio button \"([^\"]*)\" on class wise student strength$")
    public void select_radio_button_on_class_wise_student_strength(String arg1) throws Throwable {
        new ClassWiseStudentStrength(driver).clickButton(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on class wise student strength$")
    public void select_class_with_index_on_class_wise_student_strength(int arg1) throws Throwable {
        new ClassWiseStudentStrength(driver).selectClass(arg1);
    }

    @Then("^click show on class wise student strength$")
    public void click_show_on_class_wise_student_strength() throws Throwable {
        new ClassWiseStudentStrength(driver).clickShow();
    }

    @When("^click for section wise on class wise student strength$")
    public void click_for_section_wise_on_class_wise_student_strength() throws Throwable {
        new ClassWiseStudentStrength(driver).clickSectionWise();
    }

    @When("^select section with index \"([^\"]*)\" on class wise student strength$")
    public void select_section_with_index_on_class_wise_student_strength(int arg1) throws Throwable {
        new ClassWiseStudentStrength(driver).selectSection(arg1);
    }

    @When("^click new students on class wise student strength$")
    public void click_new_students_on_class_wise_student_strength() throws Throwable {
        new ClassWiseStudentStrength(driver).clickNewStudents();
    }

    @And("^select date wise on class wise student strength$")
    public void selectDateWiseOnClassWiseStudentStrength() throws Throwable {
        new ClassWiseStudentStrength(driver).clickDateWise();
    }

//category gender wise student strength
    @When("^user open category gender wise student strength$")
    public void user_open_category_gender_wise_student_strength() throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).openCategoryGenderWiseStudentStrength();
    }

    @When("^select class with index \"([^\"]*)\" on category gender wise student strength$")
    public void select_class_with_index_on_category_gender_wise_student_strength(int arg1) throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).selectClass(arg1);
    }

    @Then("^click show on category gender wise student strength$")
    public void click_show_on_category_gender_wise_student_strength() throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).clickShow();
    }

    @When("^select date range on category gender wise student strength$")
    public void select_date_range_on_category_gender_wise_student_strength() throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).clickDateRange();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on category gender wise student strength$")
    public void select_from_date_as_month_year_and_day_on_category_gender_wise_student_strength(String arg1, String arg2, String arg3) throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select radio button \"([^\"]*)\" on category gender wise student strength$")
    public void select_radio_button_on_category_gender_wise_student_strength(String arg1) throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).clickButton(arg1);
    }

    @When("^click for section wise on category gender wise student strength$")
    public void click_for_section_wise_on_category_gender_wise_student_strength() throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).clickSectionWise();
    }

    @When("^select section with index \"([^\"]*)\" on category gender wise student strength$")
    public void select_section_with_index_on_category_gender_wise_student_strength(int arg1) throws Throwable {
        new CategoryGenderWiseStudentStrength(driver).selectSection(arg1);
    }

//transport report class wise
    @When("^user open transport report class wise$")
    public void user_open_transport_report_class_wise() throws Throwable {
        new TransportReportClassWise(driver).openTransportReportClassWise();
    }

    @When("^select radio button \"([^\"]*)\" on transport report class wise$")
    public void select_radio_button_on_transport_report_class_wise(String arg1) throws Throwable {
        new TransportReportClassWise(driver).clickButton(arg1);
    }

    @When("^select installment with index \"([^\"]*)\" on transport report class wise$")
    public void select_installment_with_index_on_transport_report_class_wise(int arg1) throws Throwable {
        new TransportReportClassWise(driver).selectInstallment(arg1);
    }

    @When("^select class on transport report class wise$")
    public void select_class_on_transport_report_class_wise() throws Throwable {
        new TransportReportClassWise(driver).selectClass();
    }

    @Then("^click show on transport report class wise$")
    public void click_show_on_transport_report_class_wise() throws Throwable {
        new TransportReportClassWise(driver).clickShow();
    }

    @And("^enter stop fare \"([^\"]*)\" on transport report class wise$")
    public void enterStopFareOnTransportReportClassWise(String arg0) throws Throwable {
        new TransportReportClassWise(driver).enterStopFare(arg0);
    }

    @When("^select route with index \"([^\"]*)\" on transport report class wise$")
    public void select_route_with_index_on_transport_report_class_wise(int arg1) throws Throwable {
        new TransportReportClassWise(driver).selectRoute(arg1);
    }

    @When("^select bus stop with index \"([^\"]*)\" on transport report class wise$")
    public void select_bus_stop_with_index_on_transport_report_class_wise(int arg1) throws Throwable {
        new TransportReportClassWise(driver).selectBusStop(arg1);
    }

//nationality wise student strength
    @When("^user open nationality wise student strength$")
    public void user_open_nationality_wise_student_strength() throws Throwable {
        new NationalityWiseStudentStrength(driver).openNationalityWiseStudentStrength();
    }

    @When("^select class with index \"([^\"]*)\" on nationality wise student strength$")
    public void select_class_with_index_on_nationality_wise_student_strength(int arg1) throws Throwable {
        new NationalityWiseStudentStrength(driver).selectClass(arg1);
    }

    @Then("^click show on nationality wise student strength$")
    public void click_show_on_nationality_wise_student_strength() throws Throwable {
        new NationalityWiseStudentStrength(driver).clickShow();
    }

    @When("^select section wise on nationality wise student strength$")
    public void select_section_wise_on_nationality_wise_student_strength() throws Throwable {
        new NationalityWiseStudentStrength(driver).clickSectionWise();
    }

    @When("^select section with index \"([^\"]*)\" on nationality wise student strength$")
    public void select_section_with_index_on_nationality_wise_student_strength(int arg1) throws Throwable {
        new NationalityWiseStudentStrength(driver).selectSection(arg1);
    }

    @When("^select graphical view on nationality wise student strength$")
    public void select_graphical_view_on_nationality_wise_student_strength() throws Throwable {
        new NationalityWiseStudentStrength(driver).clickGraphicalView();
    }

//route wise student strength
    @When("^user open route wise student strength$")
    public void user_open_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).openRouteWiseStudentStrength();
    }

    @When("^select school with index \"([^\"]*)\" on route wise student strength$")
    public void select_school_with_index_on_route_wise_student_strength(int arg1) throws Throwable {
        new RouteWiseStudentStrength(driver).selectSchool(arg1);
    }

    @When("^select route on route wise student strength$")
    public void select_route_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).selectRoute();
    }

    @When("^select bus stop on route wise student strength$")
    public void select_bus_stop_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).selectBusStop();
    }

    @When("^select class on route wise student strength$")
    public void select_class_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).selectClass();
    }

    @When("^select installment on route wise student strength$")
    public void select_installment_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).selectInstallment();
    }

    @When("^select month on route wise student strength$")
    public void select_month_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).selectMonth();
    }

    @Then("^click show on route wise student strength$")
    public void click_show_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).clickShow();
    }

    @When("^select student wise on route wise student strength$")
    public void select_student_wise_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).clickStudentWise();
    }

    @When("^select route wise summary on route wise student strength$")
    public void select_route_wise_summary_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).clickRouteWise();
    }

    @When("^select with contact no on route wise student strength$")
    public void select_with_contact_no_on_route_wise_student_strength() throws Throwable {
        new RouteWiseStudentStrength(driver).clickWithContactNo();
    }
}