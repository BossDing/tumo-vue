package cn.tycoding.admin.service;

import cn.tycoding.admin.entity.ArticleCategory;

/**
 * @auther TyCoding
 * @date 2018/10/22
 */
public interface ArticleCategoryService extends BaseService<ArticleCategory> {

    /**
     * 根据文章ID删除
     * @param id
     */
    void deleteByArticleId(long id);

    /**
     * 根据分类ID删除
     * @param id
     */
    void deleteByCategoryId(long id);
}
