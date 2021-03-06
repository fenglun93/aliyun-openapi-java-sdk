/*
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

package com.aliyuncs.dg.transform.v20190327;

import com.aliyuncs.dg.model.v20190327.GetUserGatewaysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGatewaysResponseUnmarshaller {

	public static GetUserGatewaysResponse unmarshall(GetUserGatewaysResponse getUserGatewaysResponse, UnmarshallerContext _ctx) {
		
		getUserGatewaysResponse.setRequestId(_ctx.stringValue("GetUserGatewaysResponse.RequestId"));
		getUserGatewaysResponse.setSuccess(_ctx.booleanValue("GetUserGatewaysResponse.Success"));
		getUserGatewaysResponse.setCode(_ctx.stringValue("GetUserGatewaysResponse.Code"));
		getUserGatewaysResponse.setErrorMsg(_ctx.stringValue("GetUserGatewaysResponse.ErrorMsg"));
		getUserGatewaysResponse.setData(_ctx.stringValue("GetUserGatewaysResponse.Data"));
		getUserGatewaysResponse.setCount(_ctx.integerValue("GetUserGatewaysResponse.Count"));
	 
	 	return getUserGatewaysResponse;
	}
}