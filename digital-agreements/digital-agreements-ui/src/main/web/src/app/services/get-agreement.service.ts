import { Injectable } from "@angular/core";
import { CanActivate } from "@angular/router";
import { UrlService } from "./url.service";

@Injectable()
export class GetAgreementService implements CanActivate {
  constructor(private urlService: UrlService) {}

  canActivate() {
    this.urlService.getAgreement().subscribe(res => {
      console.log(res);
    });
    return true;
  }
}
