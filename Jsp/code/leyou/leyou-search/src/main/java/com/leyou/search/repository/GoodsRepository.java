/**
 * FileName: GoodsRespository
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/3/6 10:23 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/3/6
 *

 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}