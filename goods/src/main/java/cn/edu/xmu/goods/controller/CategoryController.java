package cn.edu.xmu.goods.controller;

import cn.edu.xmu.goods.model.vo.CategoryVo;
import cn.edu.xmu.goods.service.CategoryService;
import cn.edu.xmu.ooad.annotation.Audit;
import cn.edu.xmu.ooad.model.VoObject;
import cn.edu.xmu.ooad.util.Common;
import cn.edu.xmu.ooad.util.ReturnObject;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/goods", produces = "application/json;charset=UTF-8")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * 查询商品分类关系
     * @param
     * @return Object
     * createdBy Yifei Wang 2020/11/17 21:37
     */
    @ApiOperation(value = "查询商品分类关系")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value = "种类id",required = true, dataType="Integer", paramType="path")
    })
    @ApiResponses({
            @ApiResponse(code = 0, message = "成功"),
    })
    @GetMapping("/categories/{id}/subcategories")
    public Object selectCategories(@PathVariable Integer id){
        ReturnObject ret=categoryService.getSubCategories(id);
        return Common.decorateReturnObject(ret);
    }

    /**
     * 管理员新增商品类目
     * @param
     * @return Object
     * createdBy Yifei Wang 2020/11/17 21:37
     */
    @ApiOperation(value = "管理员新增商品类目")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value = "种类id",required = true, dataType="Integer", paramType="path")
    })
    @ApiResponses({
            @ApiResponse(code = 0, message = "成功"),
    })
    @PostMapping("/categories/{id}/subcategories")
    public Object addCategories(@PathVariable Integer id,@RequestBody String name){
        ReturnObject ret=categoryService.newCategory(id,name);
        return Common.decorateReturnObject(ret);
    }

    /**
     * 管理员修改商品类目
     * @param
     * @return Object
     * createdBy Yifei Wang 2020/11/17 21:37
     */
    @ApiOperation(value = "管理员修改商品类目")
    @ApiImplicitParams({
            @ApiImplicitParam(name="authorization", value="Token", required = true, dataType="String", paramType="header"),
            @ApiImplicitParam(name="id", value = "种类id",required = true, dataType="Integer", paramType="path")
    })
    @ApiResponses({
            @ApiResponse(code = 0, message = "成功"),
    })
    @PutMapping("/categories/{id}")
    public Object changeCategories(@PathVariable Integer id,@RequestBody String name){
        ReturnObject ret=categoryService.changeCategory(id,name);
        return Common.decorateReturnObject(ret);
    }

    /**
     * 管理员删除商品类目
     * @param
     * @return Object
     * createdBy Yifei Wang 2020/11/17 21:37
     */
    @ApiOperation(value = "管理员删除商品类目")
    @ApiImplicitParams({
            @ApiImplicitParam(name="authorization", value="Token", required = true, dataType="String", paramType="header"),
            @ApiImplicitParam(name="id", value = "种类id",required = true, dataType="Integer", paramType="path")
    })
    @ApiResponses({
            @ApiResponse(code = 0, message = "成功"),
    })
    @DeleteMapping("/categories/{id}")
    public Object deleteCategories(@PathVariable Integer id){
        ReturnObject ret=categoryService.deleteCategoryById(id);
        return Common.decorateReturnObject(ret);
    }

}
