package com.etc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/1 12:43
 * 页面控制器
 */
@Controller
public class PageController {

    Logger logger = Logger.getLogger(PageController.class);


    //主页控制器
    @GetMapping("/index")
    public String index() {
        logger.info("进入主页控制器！");
        return "index";
    }




    @GetMapping("/toadddepartment")
    public String toAddDepartment() {

        return "add-department";
    }

    @GetMapping("/toaddexpenses")
    public String toAddExpenses() {

        return "add-expenses";
    }
    @GetMapping("/toaddfeescollection")
    public String toAddFeesCollection() {

        return "add-fees-collection";
    }

    @GetMapping("/toaddsalary")
    public String toAddSalary() {

        return "add-salary";
    }

//    @GetMapping("/toaddstudent")
//    public String toAddStudent() {
//
//        return "addstudent";
//    }

    @GetMapping("/toaddsubject")
    public String toAddsubject() {

        return "add-subject";
    }

    @GetMapping("/toaddteacher")
    public String toAddTeacher() {

        return "add-teacher";
    }

    @GetMapping("/toblankpage")
    public String toBlankPage() {

        return "blank-page";
    }

    @GetMapping("/tocomponents")
    public String toComponents() {

        return "components";
    }

    @GetMapping("/todatatables")
    public String toDataTables() {

        return "data-tables";
    }

    @GetMapping("/todepartments")
    public String toDepartments() {

        return "departments";
    }

    @GetMapping("/toeditdepartment")
    public String toEditDepartment() {

        return "edit-department";
    }
//
//    @GetMapping("/toeditstudent")
//    public String toEditStudent() {
//
//        return "editstudent";
//    }



    @GetMapping("/toeditteacher")
    public String toEditTeacher() {

        return "edit-teacher";
    }

    @GetMapping("/toerror404")
    public String toError404() {

        return "error-403";
    }

    @GetMapping("/toevent")
    public String toEvent() {

        return "event";
    }

    @GetMapping("/toexam")
    public String exam() {

        return "exam";
    }

    @GetMapping("/toexpenses")
    public String toExpenses() {

        return "expenses";
    }

//    @GetMapping("/tofeescollections")
//    public String toFeesCollections() {
//
//        return "fees-collections";
//    }

//    @GetMapping("/tofees")
//    public String toFees() {
//
//        return "fees";
//    }

    @GetMapping("/toforgotpassword")
    public String toForgotPassword() {

        return "forgetpassword";
    }

    @GetMapping("/toformbasicinputs")
    public String toFormBasicInputs() {

        return "form-basic-inputs";
    }

    @GetMapping("/toformhorizontal")
    public String toFormHorizontal() {

        return "form-horizontal";
    }

    @GetMapping("/toforminputgroups")
    public String toFormiInputGroups() {

        return "form-input-groups";
    }

    @GetMapping("/toformmask")
    public String toFormMask() {

        return "form-mask";
    }

    @GetMapping("/toformvertical")
    public String toFormVertical() {

        return "form-vertical";
    }

    @GetMapping("/toformvalidation")
    public String toFormValidation() {

        return "form-validation";
    }

    @GetMapping("/toholiday")
    public String toHoliday() {

        return "holiday";
    }

    @GetMapping("/tohostel")
    public String toHostel() {

        return "hostel";
    }

    @GetMapping("/toinbox")
    public String toInbox() {

        return "inbox";
    }

    @GetMapping("/toinvoice")
    public String toInvoice() {

        return "invoice";
    }

    @GetMapping("/tolibrary")
    public String toLibrary() {

        return "library";
    }

    @GetMapping("/toprofile")
    public String toProfile() {

        return "profile";
    }

    @GetMapping("/toregister")
    public String toRegister() {

        return "register";
    }

 /*   @GetMapping("/tosalary")
    public String toSalary() {

        return "salary";
    }*/

    @GetMapping("/tosports")
    public String toSports() {

        return "sports";
    }

    @GetMapping("/tostudentdetails")
    public String toStudentDetails() {

        return "studentdetails";
    }

    @GetMapping("/tostudents")
    public String toStudents() {

        return "students";
    }

    @GetMapping("/tosubjects")
    public String toSubjects() {

        return "subjects";
    }

    @GetMapping("/totablesbasic")
    public String toTablesBasic() {

        return "tables-basic";
    }

//    @GetMapping("/toteacherdetails")
//    public String toTeacherDetails() {
//
//        return "teacher-details";
//    }

    @GetMapping("/toteachers")
    public String toTeachers() {

        return "teachers";
    }

    @GetMapping("/totimetable")
    public String toTimeTable() {

        return "time-table";
    }

    @GetMapping("/totransport")
    public String toTransport() {

        return "transport";
    }
//    @GetMapping("/toyiqinglists")
//    public String toYiQinglist(){
//        return "yiqinglist";
//    }

}
