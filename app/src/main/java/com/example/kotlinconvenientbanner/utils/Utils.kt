package com.example.kotlinconvenientbanner.utils

/**
 * Created by admin on 2017/12/20.
 */
object Utils {

    /**
     * 用于显示网络图片
     */
    var images = arrayOf("http://img2.imgtn.bdimg.com/it/u=3093785514,1341050958&fm=21&gp=0.jpg", "http://img2.3lian.com/2014/f2/37/d/40.jpg", "http://d.3987.com/sqmy_131219/001.jpg", "http://img2.3lian.com/2014/f2/37/d/39.jpg", "http://www.8kmm.com/UploadFiles/2012/8/201208140920132659.jpg", "http://f.hiphotos.baidu.com/image/h%3D200/sign=1478eb74d5a20cf45990f9df460b4b0c/d058ccbf6c81800a5422e5fdb43533fa838b4779.jpg", "http://f.hiphotos.baidu.com/image/pic/item/09fa513d269759ee50f1971ab6fb43166c22dfba.jpg")

    /**
     * 通过文件名获取资源id 例子：getResId("icon", R.drawable.class);
     *
     * @param variableName
     * @param c
     * @return
     */
    fun getResId(variableName: String, c: Class<*>): Int {
        try {
            val idField = c.getDeclaredField(variableName)
            return idField.getInt(idField)
        } catch (e: Exception) {
            e.printStackTrace()
            return -1
        }

    }
}
