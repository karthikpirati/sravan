import { Injectable } from "@angular/core";
import { Observable, Subject } from "rxjs";
import { HttpClient, HttpHeaders } from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class UrlService {
  constructor(private http: HttpClient) {}

  private baseUrl = "http://localhost:8080";
  // private baseUrl = "/digitialAgreements";

  acceptAgreement(): Observable<any> {
    return this.http.get(this.baseUrl + "/agreement/accept");
  }

  getAgreement(): Observable<any> {
    return this.http.get(this.baseUrl + "/agreement/get");
  }
}
