package com.etc.controller;

import com.etc.po.*;
import com.etc.service.MajorService;
import com.etc.service.PPTService;
import com.etc.service.PhotoService;
import com.etc.util.FileUpload;
import com.etc.vo.MajorVo;
import com.etc.vo.PPTVO;
import com.mongodb.client.result.UpdateResult;

import org.apache.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.List;



/**
 * @author GX
 */
@Controller
public class YunKeTangController {
    Logger logger = Logger.getLogger(YunKeTangController.class);
    @Autowired
    PhotoService photoService;

    @Resource
    PPTService pptService;

    @Autowired
    MajorService majorService;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/yunindex")
    public String photofindBypip(Photo photo, Model model) {
        logger.info(photo);
        List<Photo> list = photoService.findBypip(photo);
        model.addAttribute("list", list);
        return "yunketang";
    }

    @GetMapping("/pptlist")
    public String pptlist(int photoid, Model model) {
        List<PPTVO> list = pptService.findByid(photoid);
        model.addAttribute("pptlist", list);
        int photoid1 = photoid;
        model.addAttribute("photoid", photoid1);
        return "ppt";
    }

    @GetMapping("/pptinfo")
    public String pptinfo(int photoid, Model model) {
        List<PPTVO> list = pptService.findByid(photoid);
        model.addAttribute("pptlist", list);
        int photoid1 = photoid;
        model.addAttribute("photoid", photoid1);
        return "ppt2";
    }

    @GetMapping("/addppt")
    public String addppt(int photoid,String photoname, Model model) {
        int photoid1 = photoid;
        model.addAttribute("photoid", photoid1);
        List<PPTVO> list = pptService.findByid(photoid);
        model.addAttribute("pptlist", list);
        List<MajorVo> all = majorService.findAll();
        model.addAttribute("major1", all);
        model.addAttribute("photoname",photoname);
        return "addppt1";
    }

    @GetMapping("/video1")
    public String video(int pptid, Model model) {
        logger.info(pptid);
        PPT ppt = pptService.findBypid(pptid);
        model.addAttribute("video", ppt);
        return "ppt1";
    }

    @GetMapping("/phtname")
    public String findByPtname(String ptname, Model model) {
        List<Photo> list = photoService.findByPtname(ptname);
        for (Photo photo : list) {
            System.out.println(photo);
        }
        model.addAttribute("photoptname", list);
        return "yunketangptname";
    }

    @RequestMapping("/uploadppt")
    public String pptinsert(@RequestParam("file") MultipartFile file, @RequestParam("file1") MultipartFile file1, PPT ppt, Model model, int photoid) {
        logger.info("进入添加ppt控制器");
        logger.info(ppt.getMid());
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String filename = FileUpload.saveFile(file);
        String filename1 = FileUpload.saveFile(file1);
        ppt.setPptsrc("img" + File.separator + filename);
        ppt.setVsrc("img" + File.separator + filename1);
        boolean falg = pptService.pptinsert(ppt);
        List<PPTVO> list = pptService.findByid(photoid);
        model.addAttribute("pptlist", list);
        List<MajorVo> all = majorService.findAll();
        model.addAttribute("major1", all);
        int photoid1 = photoid;
        model.addAttribute("photoid", photoid1);
        return "addppt1";
    }

    @PostMapping("/insertphoto")
    public String photoinsert(@RequestParam("file") MultipartFile file, Photo photo, String ptname, Model model) {
        String fileName = FileUpload.saveFile(file);
        photo.setPhotosrc("img/" + fileName);
        boolean falg = photoService.photoinsert(photo);
        List<Photo> list = photoService.findByPtname(ptname);
        for (Photo photo1 : list) {
            System.out.println(photo1);
        }
        model.addAttribute("photoptname", list);
        return "yunketangptname";
    }

    @GetMapping("/addphoto")
    public String addphoto() {
        return "addphoto2";
    }

    @RequestMapping("/deleteppt")
    public String deleteppt(int pptid, RedirectAttributes redirectAttributes, int photoid) {
        boolean falg = pptService.pptdatele(pptid);
        logger.info(falg);
        redirectAttributes.addAttribute("photoid", photoid);
        return "redirect:addppt";
    }

    @RequestMapping("/phototype")
    public String phototype(String phototype, String pip, Model model) {
        List<Photo> list = photoService.finBytype(phototype, pip);
        model.addAttribute("list", list);
        return "yunketang";
    }

    @RequestMapping("/phtnamepip")
    public String phtnamepip(String ptname, String pip, Model model) {
        logger.info(ptname);
        logger.info(pip);
        List<Photo> list = photoService.findBynameandpip(ptname, pip);
        model.addAttribute("photoptname", list);
        return "yunketangptname";
    }

    @RequestMapping("/photoname")
    public String photoname(String photoname, String pip, Model model) {
        logger.info(photoname);
        logger.info(pip);
        List<Photo> list = photoService.findByphotoname(photoname, pip);
        model.addAttribute("list", list);
        return "yunketang";
    }

    @RequestMapping("/photoall")
    public String photoall(Model model) {
        List<Photo> list = photoService.findAll();
        model.addAttribute("list1", list);
        return "photolist2";
    }

    @RequestMapping("/photoupdate")
    public String photoupdate(int photoid, String pip) {
        boolean falg = photoService.photoupdate1(photoid, pip);
        return "redirect:/photoall";
    }

    @RequestMapping("/updatephsrc")
    public String updatephsrc(@RequestParam("file") MultipartFile file, Photo photo, String ptname, RedirectAttributes redirectAttributes) {
        String fileName = FileUpload.saveFile(file);
        photo.setPhotosrc("img/" + fileName);
        boolean falg = photoService.photoupdate(photo);
        redirectAttributes.addAttribute("ptname", ptname);
        return "redirect:/phtname";
    }

    @GetMapping("/toaddex")
    public String toaddex(int photoid,String mess, Model model) {
        int photoid1 = photoid;
        model.addAttribute("photoid", photoid1);
        Query query = Query.query(Criteria.where("photoid").is(photoid));
        List<Exampaper> list = mongoTemplate.find(query, Exampaper.class);
        for (Exampaper exampaper1 : list) {
            System.out.println(exampaper1);
        }
        model.addAttribute("exampaperlist", list);
        model.addAttribute("mess1",mess);
        return "addexampaper";
    }

    @RequestMapping("/exampaperinsert")
    public String exampaperinsert(Exampaper exampaper, int photoid, Model model) {
        logger.info("进入添加考试");
        logger.info(exampaper.getEndtime());
        logger.info(exampaper.getExampapername());
        logger.info(exampaper.getExampapertype());
        logger.info(exampaper.getTname());
        logger.info(exampaper.getPhotoid());
        exampaper.setStarttime(new Date(System.currentTimeMillis()));
        logger.info(exampaper.getStarttime());
        mongoTemplate.insert(exampaper);
        Query query = Query.query(Criteria.where("photoid").is(photoid));
        List<Exampaper> list = mongoTemplate.find(query, Exampaper.class);
        for (Exampaper exampaper1 : list) {
            System.out.println(exampaper1);
        }
        model.addAttribute("exampaperlist", list);
        model.addAttribute("photoid",photoid);
        return "addexampaper";
    }

    @RequestMapping("/toaddcontant")
    public String toaddcontant(String exampapername, String id, Model model) {
        String examcontant1 = exampapername;
        model.addAttribute("exampapername", examcontant1);
        Query query = Query.query(Criteria.where("id").is(id));
        logger.info(id);
        List<Examcontant> list = mongoTemplate.find(query, Examcontant.class);
        for (Examcontant examcontant : list) {
            System.out.println(examcontant);
        }
        logger.info(list.size());
        model.addAttribute("examcontantlist", list);
        String id1 = id.toString();
        model.addAttribute("_id", id1);
        return "addexamcontant";
    }
    @RequestMapping("/deletepaper")
    public String deletepaper(int photoid,String _id,RedirectAttributes redirectAttributes){
        logger.info(_id);
        ObjectId id=new ObjectId(_id);
        logger.info(id);
        Query query1 = Query.query(Criteria.where("id").is(_id));
        List<Examcontant> list1 = mongoTemplate.find(query1, Examcontant.class);
        for (Examcontant examcontant : list1) {
            System.out.println(examcontant);
        }
        logger.info(list1.size());
        if(list1.size()==0){
        Query query = Query.query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query,Exampaper.class);
        List<Examcontant> list = mongoTemplate.find(query, Examcontant.class);
        }else {
            redirectAttributes.addAttribute("mess","该考试已使用，无法删除");
        }
        redirectAttributes.addAttribute("photoid",photoid);

        return "redirect:/toaddex";
    }

    @RequestMapping("/examcontantinsert")
    public String examcontantinsert(Examcontant examcontant, String exampapername, String id, RedirectAttributes redirectAttributes) {
        logger.info(examcontant.getAnswer());
        logger.info(examcontant.getExampapername());
        logger.info(examcontant.getItemcontant());
        logger.info(examcontant.getNum());
        logger.info(examcontant.getScore());
        logger.info(examcontant.getA());
        logger.info(examcontant.getAcontant());
        logger.info(examcontant.getB());
        logger.info(examcontant.getBcontant());
        logger.info(examcontant.getC());
        logger.info(examcontant.getCcontant());
        logger.info(examcontant.getD());
        logger.info(examcontant.getDcontant());
        mongoTemplate.insert(examcontant);
        redirectAttributes.addAttribute("exampapername", exampapername);
        redirectAttributes.addAttribute("id", id);
        return "redirect:/toaddcontant";
    }

    @RequestMapping("/exampaper")
    public String examcontant(int photoid, Model model) {
        int photoid1 = photoid;
        model.addAttribute("photoid", photoid1);
        Query query = Query.query(Criteria.where("photoid").is(photoid));
        List<Exampaper> list = mongoTemplate.find(query, Exampaper.class);
        for (Exampaper exampaper : list) {
            System.out.println(exampaper);
        }
        model.addAttribute("exampaperlist", list);
        return "exampaperlist";
    }

    @RequestMapping("/findcontant")
    public String findcontant(String exampapername, String id, Model model) {
        logger.info("进入findcontant");
        String examcontant1 = exampapername;
        model.addAttribute("exampapername", examcontant1);
        Query query = Query.query(Criteria.where("id").is(id));
        logger.info(id);
        List<Examcontant> list = mongoTemplate.find(query, Examcontant.class);
        for (Examcontant examcontant : list) {
            System.out.println(examcontant);
        }
        model.addAttribute("examcontantlist", list);
        Query query1 = Query.query(Criteria.where("_id").is(id));
        logger.info(id);
        List<Exampaper> list1 = mongoTemplate.find(query1, Exampaper.class);
        for (Exampaper ex:list1) {
            String endtime1=ex.getEndtime();
            int endtime=Integer.valueOf(endtime1);
            model.addAttribute("endtime",endtime);
        }
        String id1 = id.toString();
        model.addAttribute("_id", id1);
        return "examcontant";
    }
    @RequestMapping("/exorderinsert")
    public String exorderinsert(Examorder examorder,Examcontant examcontant, Model model) {
        logger.info("进入控制器");
        mongoTemplate.insert(examorder);
        String score=examorder.getScore();
        String i=score.substring(0,2);
        String i2=score.substring(3,5);
        String i3=score.substring(6,8);
        String i4=score.substring(9,11);
        String i5=score.substring(12,14);
        String answer=examorder.getAnswer();
        String a=answer.substring(0,1);
        String a1=answer.substring(2,3);
        String a2=answer.substring(4,5);
        String a3=answer.substring(6,7);
        String a4=answer.substring(8,9);
        logger.info(i);
        logger.info(i2);
        logger.info(i3);
        logger.info(i4);
        logger.info(i5);
        logger.info(a);
        logger.info(a1);
        logger.info(a2);
        logger.info(a3);
        logger.info(a4);
        if (examorder.getI().equals(a)){
            logger.info(examorder.get_id());
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore",i);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }else {
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore",0);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }if (examorder.getII().equals(a1)){
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore1",i2);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }else {
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore1",0);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }if (examorder.getIII().equals(a2)){
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore2",i3);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }else {
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore2",0);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }if (examorder.getIV().equals(a3)){
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore3",i4);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }else {
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore3",0);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }if (examorder.getV().equals(a4)){
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore4",i5);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }else {
            Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sscore4",0);
            UpdateResult updateResult = mongoTemplate.updateFirst(query,update,Examorder.class);
        }
        Query query = Query.query(Criteria.where("_id").is(examorder.get_id()));
        List<Examorder> list = mongoTemplate.find(query, Examorder.class);
        for (Examorder examorder1:list) {
            String sscore=examorder1.getSscore();
            int s=Integer.parseInt(sscore);
            logger.info(s);
            String sscore1=examorder1.getSscore1();
            int s1=Integer.parseInt(sscore1);
            logger.info(s1);
            String sscore2=examorder1.getSscore2();
            int s2=Integer.parseInt(sscore2);
            logger.info(s2);
            String sscore3=examorder1.getSscore3();
            int s3=Integer.parseInt(sscore3);
            logger.info(s3);
            String sscore4=examorder1.getSscore4();
            int s4=Integer.parseInt(sscore4);
            logger.info(s4);
            int sum=s+s1+s2+s3+s4;
            Query query1 = Query.query(Criteria.where("_id").is(examorder.get_id()));
            Update update = Update.update("sum",sum);
            UpdateResult updateResult = mongoTemplate.updateFirst(query1,update,Examorder.class);
        }
        Query query2 = Query.query(Criteria.where("_id").is(examorder.get_id()));
        List<Examorder> list1 = mongoTemplate.find(query2, Examorder.class);
        model.addAttribute("sumorder",list1);
        return "sum";
    }
    @RequestMapping("/spost")
    public String spost(){

        int i1=100-10;
        return "";
    }
}
