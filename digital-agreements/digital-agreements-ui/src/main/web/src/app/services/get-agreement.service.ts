import { Injectable } from "@angular/core";
import { CanActivate } from "@angular/router";
import { UrlService } from "./url.service";

@Injectable()
export class GetAgreementService implements CanActivate {
  constructor(private urlService: UrlService) {}

  canActivate() {
    let isExists: boolean = true;
    this.urlService.getAgreement().subscribe(res => {});
    return isExists;
  }
}
