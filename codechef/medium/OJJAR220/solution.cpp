
      const modalContent = (
          <div className="modal-backdrop" onClick={handleDismiss}>
                <div 
                        className="modal-dialog" 
                                role="dialog" 
                                        aria-modal="true" 
                                                aria-label={title}
                                                        onClick={(e) => e.stopPropagation()} // Prevent clicks inside from closing it
                                                              >
                                                                      <h2>{title}</h2>
                                                                              <button onClick={handleDismiss}>Close</button>
                                                                                      <hr />
                                                                                              {children}
                                                                                                    </div>
                                                                                                        </div>
                                                                                                          );

                                                                                                            // Use createPortal to teleport modalContent to the modal-root DOM node
                                                                                                              return createPortal(modalContent, modalRoot);
                                                                                                              }

                                                                                                              export default Modal;