import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { tap } from 'rxjs/operators';
import { MessageService } from '../services/message.service';
import { MessageDetail } from '../dashboard/report/model';
import { Observable } from 'rxjs';
import { Location } from '@angular/common';

@Component({
  selector: 'app-message-detail',
  templateUrl: './message-detail.component.html',
  styleUrls: ['./message-detail.component.css']
})
export class MessageDetailComponent implements OnInit {
  messageDetail$: Observable<MessageDetail>;

  constructor(private route: ActivatedRoute, private messageApi: MessageService, private location: Location) {
    console.log('constructor');
  }

  goBack() {
    this.location.back();
  }

  ngOnInit() {
    console.log('init');
    this.route.params.pipe(
      tap((params) => {
        this.messageDetail$ = this.messageApi.getMessage(params.messageId);
        console.log('Got message details');
      }
      )).subscribe();
  }

}
