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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenRouteMapsRequest extends RpcAcsRequest<DescribeCenRouteMapsResponse> {
	
	public DescribeCenRouteMapsRequest() {
		super("Cbn", "2017-09-12", "DescribeCenRouteMaps", "cbn");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String cenId;

	private String ownerAccount;

	private String cenRegionId;

	private Integer pageSize;

	private String routeMapId;

	private Long ownerId;

	private Integer pageNumber;

	private String transmitDirection;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getCenRegionId() {
		return this.cenRegionId;
	}

	public void setCenRegionId(String cenRegionId) {
		this.cenRegionId = cenRegionId;
		if(cenRegionId != null){
			putQueryParameter("CenRegionId", cenRegionId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getRouteMapId() {
		return this.routeMapId;
	}

	public void setRouteMapId(String routeMapId) {
		this.routeMapId = routeMapId;
		if(routeMapId != null){
			putQueryParameter("RouteMapId", routeMapId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getTransmitDirection() {
		return this.transmitDirection;
	}

	public void setTransmitDirection(String transmitDirection) {
		this.transmitDirection = transmitDirection;
		if(transmitDirection != null){
			putQueryParameter("TransmitDirection", transmitDirection);
		}
	}

	@Override
	public Class<DescribeCenRouteMapsResponse> getResponseClass() {
		return DescribeCenRouteMapsResponse.class;
	}

}