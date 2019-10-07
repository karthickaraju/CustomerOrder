package CustomerOrder;

import java.util.ArrayList;

public class ArticleReg {
	
	public ArrayList<Article> articleList = new ArrayList<Article>();
	
	public ArticleReg() {}
	Article article;

	public ArrayList<Article> getArticleList() {
		return articleList;}

	public void setArticleList(ArrayList<Article> articleList) {
		this.articleList = articleList;}
	
	 public Article find(String articleid) 
	 {
	        for (int i = 0; i < articleList.size(); i++) {
	            if (articleList.get(i).getarticleId().equals(articleid)) {
	                System.out.println(" Article is found"+article.getarticleId());
	                return articleList.get(i);
	            }
	        }
	        return null;
	    }

	 public void add(Article article) 
	 {
		 articleList.add(article);
	 }
		 
	public void remove(String articleid)
	{
		 for (int i = 0; i < articleList.size(); i++) {
			 if (articleList.get(i).getarticleId().equals(articleid)) {
				 articleList.remove(articleList.get(i));
			 }
		 }
	}
	
	public void printAllArticle()
	{
		for (int i = 0; i < articleList.size(); i++) { 
			
			System.out.println("Article name " + articleList.get(i).getarticleName() + "Article Id: " + articleList.get(i).getarticlePrice());
		}
	}

	 
    public void update(String articleid, String name)
    {
		Article article = this.find(articleid);
        article.setarticleName(name);
											
		}
    }
   
	
	
	
		
		
		
	