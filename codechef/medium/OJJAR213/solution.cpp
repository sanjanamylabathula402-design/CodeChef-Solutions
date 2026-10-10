                                                                                                                      }

                                                                                                                      // 3. Intermediate Layout Component (Generic, no user props)
                                                                                                                      function CardWrapper({ children }) {
                                                                                                                        return (
                                                                                                                            <div className="card-wrapper">
                                                                                                                                  {children}
                                                                                                                                      </div>
                                                                                                                                        );
                                                                                                                                        }

                                                                                                                                        // 4. Specific Card Component (Consumes slots via props and children)
                                                                                                                                        function Card({ headerContent, children, footerContent }) {
                                                                                                                                          return (
                                                                                                                                              <div className="card">
                                                                                                                                                    <div className="card-header">{headerContent}</div>
                                                                                                                                                          <div className="card-body">{children}</div>
                                                                                                                                                                <div className="card-footer">{footerContent}</div>
                                                                                                                                                                    </div>
                                                                                                                                                                      );
                                                                                                                                                                      }

                                                                                                                                                                      export default UserProfilePage;