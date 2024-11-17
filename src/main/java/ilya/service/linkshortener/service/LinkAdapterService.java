package ilya.service.linkshortener.service;

import ilya.service.linkshortener.dto.controller.request.LinkInfoRequest;
import ilya.service.linkshortener.dto.controller.request.UpdateLinkInfoRequest;
import ilya.service.linkshortener.dto.controller.response.GetAllLinkInfoResponse;
import ilya.service.linkshortener.dto.controller.response.LinkInfoResponse;
import ilya.service.linkshortener.dto.wrapper.CommonRequest;
import ilya.service.linkshortener.dto.wrapper.CommonResponse;

public interface LinkAdapterService {
    CommonResponse<LinkInfoResponse> create(CommonRequest<LinkInfoRequest> requestDto);

    CommonResponse<LinkInfoResponse> update(CommonRequest<UpdateLinkInfoRequest> request);

    CommonResponse<GetAllLinkInfoResponse> getByFilter();
}