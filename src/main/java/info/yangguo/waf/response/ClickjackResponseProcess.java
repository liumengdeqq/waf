/*
 * Copyright 2018-present yangguo@outlook.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.yangguo.waf.response;

import info.yangguo.waf.Constant;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

/**
 * @author:杨果
 * @date:2017/4/11 下午4:39
 * <p>
 * Description:
 */
public class ClickjackResponseProcess implements ResponseProcess {
    @Override
    public HttpResponse doFilter(HttpRequest originalRequest, HttpResponse httpResponse) {
        httpResponse.headers().add("X-FRAME-OPTIONS", Constant.X_Frame_Option);
        return httpResponse;
    }
}
