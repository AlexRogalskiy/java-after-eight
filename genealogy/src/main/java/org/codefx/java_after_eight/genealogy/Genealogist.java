package org.codefx.java_after_eight.genealogy;

import org.codefx.java_after_eight.article.Article;

public interface Genealogist {

	TypedRelation infer(Article article1, Article article2);

}