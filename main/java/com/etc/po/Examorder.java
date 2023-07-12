package com.etc.po;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author GX
 * 试题
 */

@Document(collection = "examorder")
public class Examorder {
   @Id
   private ObjectId _id;
   private String id;
   private String score;
   private String answer;
   @Indexed
   private int sum;
   /**
    * 专业编号
    */
   private String I;
   private String II;
   private String III;
   private String IV;
   private String V;
   @Indexed
   private String sscore;
   @Indexed
   private String sscore1;
   @Indexed
   private String sscore2;
   @Indexed
   private String sscore3;
   @Indexed
   private String sscore4;
   public Examorder() {
   }

   @Override
   public String toString() {
      return "Examorder{" +
              "_id=" + _id +
              ", id='" + id + '\'' +
              ", score='" + score + '\'' +
              ", answer='" + answer + '\'' +
              ", sum=" + sum +
              ", I='" + I + '\'' +
              ", II='" + II + '\'' +
              ", III='" + III + '\'' +
              ", IV='" + IV + '\'' +
              ", V='" + V + '\'' +
              ", sscore='" + sscore + '\'' +
              ", sscore1='" + sscore1 + '\'' +
              ", sscore2='" + sscore2 + '\'' +
              ", sscore3='" + sscore3 + '\'' +
              ", sscore4='" + sscore4 + '\'' +
              '}';
   }

   public ObjectId get_id() {
      return _id;
   }

   public void set_id(ObjectId _id) {
      this._id = _id;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getScore() {
      return score;
   }

   public void setScore(String score) {
      this.score = score;
   }

   public String getAnswer() {
      return answer;
   }

   public void setAnswer(String answer) {
      this.answer = answer;
   }

   public int getSum() {
      return sum;
   }

   public void setSum(int sum) {
      this.sum = sum;
   }

   public String getI() {
      return I;
   }

   public void setI(String i) {
      I = i;
   }

   public String getII() {
      return II;
   }

   public void setII(String II) {
      this.II = II;
   }

   public String getIII() {
      return III;
   }

   public void setIII(String III) {
      this.III = III;
   }

   public String getIV() {
      return IV;
   }

   public void setIV(String IV) {
      this.IV = IV;
   }

   public String getV() {
      return V;
   }

   public void setV(String v) {
      V = v;
   }

   public String getSscore() {
      return sscore;
   }

   public void setSscore(String sscore) {
      this.sscore = sscore;
   }

   public String getSscore1() {
      return sscore1;
   }

   public void setSscore1(String sscore1) {
      this.sscore1 = sscore1;
   }

   public String getSscore2() {
      return sscore2;
   }

   public void setSscore2(String sscore2) {
      this.sscore2 = sscore2;
   }

   public String getSscore3() {
      return sscore3;
   }

   public void setSscore3(String sscore3) {
      this.sscore3 = sscore3;
   }

   public String getSscore4() {
      return sscore4;
   }

   public void setSscore4(String sscore4) {
      this.sscore4 = sscore4;
   }


   public Examorder(ObjectId _id, String id, String score, String answer, int sum, String i, String II, String III, String IV, String v, String sscore, String sscore1, String sscore2, String sscore3, String sscore4) {
      this._id = _id;
      this.id = id;
      this.score = score;
      this.answer = answer;
      this.sum = sum;
      I = i;
      this.II = II;
      this.III = III;
      this.IV = IV;
      V = v;
      this.sscore = sscore;
      this.sscore1 = sscore1;
      this.sscore2 = sscore2;
      this.sscore3 = sscore3;
      this.sscore4 = sscore4;
   }
}
