import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { AgreementComponent } from "./agreement/agreement.component";
import { HeaderComponent } from "./header/header.component";
import { UrlService } from "./services/url.service";
import { GetAgreementService } from "./services/get-agreement.service";
import { HttpClientModule } from "@angular/common/http";
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [AppComponent, AgreementComponent, HeaderComponent, FooterComponent],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule],
  providers: [UrlService, GetAgreementService],
  bootstrap: [AppComponent]
})
export class AppModule {}
