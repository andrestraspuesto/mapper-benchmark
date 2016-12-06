package andrestraspuesto.pojos;

public class DstOuter {

  private Integer id;

  private String f1;

  private Double f2;

  private DstInner inner;

  public Integer getId(){return id;}
  public void setId(Integer id){this.id = id;}
  public String getF1(){return f1;}
  public void setF1(String f1){this.f1 = f1;}
  public Double getF2(){return f2;}
  public void setF2(Double f2){this.f2 = f2;}
  public DstInner getInner(){return inner;}
  public void setInner(DstInner inner){this.inner = inner;}
}
